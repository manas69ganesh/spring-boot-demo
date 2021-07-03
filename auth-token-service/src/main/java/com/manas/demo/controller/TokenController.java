package com.manas.demo.controller;

import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manas.demo.bean.TokenBean;

@RestController
@RequestMapping("/v1/api")
public class TokenController {

	@GetMapping(value = "/get-token",produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public TokenBean getToken() {

		return new TokenBean("abcdefgh1234567890");
	}

}
