package com.jason.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jason.dto.RegisterDto;

@RestController
public class RegisterController {
	
	Logger logger =LoggerFactory.getLogger(RegisterController.class.getName());
	
	@PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity registerApi(@RequestBody RegisterDto registerDto) throws JsonProcessingException  {
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(registerDto);//將輸入的參數物件轉json字串
		
		if(StringUtils.isAnyBlank(registerDto.getMemberAccount(),registerDto.getMemberPassword(),registerDto.getMemberName())) {
			return ResponseEntity.badRequest().body(jsonString);
		}
		return ResponseEntity.ok().body(jsonString);
	}

}