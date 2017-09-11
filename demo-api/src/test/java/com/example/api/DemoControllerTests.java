package com.example.api;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class DemoControllerTests {

	@Autowired
    private MockMvc mvc;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void helloR() throws Exception{
		String url = "/demo/hello";
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		map.add("name", "cai");
		String body = restTemplate.postForObject(url, map, String.class);
		System.out.println(new JSONObject(map.toSingleValueMap()).toString());
		System.out.println(body);
	}
}
