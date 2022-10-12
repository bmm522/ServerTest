package com.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.TestDTO;

@CrossOrigin(origins="http://127.0.0.1:5501/", allowedHeaders="http://127.0.0.1:5501/")
@RestController
public class TestController {
	
	@PostMapping("/test")
	@ResponseBody
	public Map<String, Object> Test(TestDTO testDTO){
		HashMap<String,Object> result = new HashMap<String,Object>();
		result.put("result", testDTO.getText());
		return result;
	}
}
