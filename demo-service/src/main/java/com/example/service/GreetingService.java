package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MessageMapper;
import com.example.model.Message;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class GreetingService {
	@Autowired
	MessageMapper messageMapper;
	
	@Transactional
	public String getName()
	{
		Message message = new Message();
		message.setContent("Spring boot");
		messageMapper.insertSelective(message);
		
		PageHelper.startPage(2, 10);
		Page<Message> messages = (Page<Message>)messageMapper.selectSelective(new Message());
		System.out.println(messages.getTotal());
		
		return "Service";
	}
}
