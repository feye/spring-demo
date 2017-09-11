package com.example.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.DemoDTO;
import com.example.entity.ErrorCode;
import com.example.entity.ResultEntity;
import com.example.model.Demo;
import com.example.service.DemoSevice;
import com.example.utils.ParamUtils;
import com.github.pagehelper.Page;

@RestController
@RequestMapping("/demo")
public class DemoController {

	Logger log = Logger.getLogger(this.getClass());

	@Autowired
	DemoSevice demoSevice;

	@RequestMapping("/hello")
	public Object hello(String name, Long uId) {
		if (name == null)
			name = "World";

		log.info("Hello, " + name + "!");
		demoSevice.newRecord(name);

		ResultEntity result = new ResultEntity();
		result.setCodeAndMsg(ErrorCode.SUCCESS);
		result.put("msg", "Hello, " + name + "!");
		return result;
	}

	@RequestMapping("/records")
	public Object records(Integer pageIndex, Integer pageSize) {
		ResultEntity result = new ResultEntity();
		if (ParamUtils.examineOneNull(pageIndex, pageSize)) {
			result.setCode(ErrorCode.ERROR_PARAM_INCOMPLETE.getCode());
			result.setMsg(ErrorCode.ERROR_PARAM_INCOMPLETE.getMessage());
			return result;
		}

		List<DemoDTO> recordDTOs = new ArrayList<DemoDTO>();
		try {
			Page<Demo> records = demoSevice.obtainRecord(pageIndex, pageSize);
			for (Demo r : records) {
				DemoDTO recordDTO = new DemoDTO();
				BeanUtils.copyProperties(r, recordDTO);

				recordDTOs.add(recordDTO);
			}
		} catch (Exception e) {
			result.setCode(ErrorCode.SUCCESS.getCode());
			result.setMsg(ErrorCode.SUCCESS.getMessage());
			return result;
		}

		result.put("records", recordDTOs);
		result.setCode(ErrorCode.SUCCESS.getCode());
		result.setMsg(ErrorCode.SUCCESS.getMessage());
		return result;
	}

}
