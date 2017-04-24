package com.example.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Greeting;
import com.example.service.GreetingService;

@RestController
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService;
	@Autowired	
	private StringRedisTemplate stringRedisTemplate; 
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	stringRedisTemplate.opsForValue().set("name", name);
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, greetingService.getName()));
    }
}
