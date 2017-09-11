package com.example.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DemoMapper;
import com.example.model.Demo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class DemoSevice {
	@Autowired
	DemoMapper demoMapper;
	
	public Integer newRecord(String name)
	{
		Demo demo = new Demo();
		demo.setName(name);
		demo.setCreateTime(new Date());
		return demoMapper.insertSelective(demo);
	}
	
	public Page<Demo> obtainRecord(Integer pageIndex, Integer pageSize)
	{
		PageHelper.startPage(pageIndex, pageSize);
		Page<Demo> records =  (Page<Demo>) demoMapper.selectSelective(new Demo());
		
		return records;
	}
}
