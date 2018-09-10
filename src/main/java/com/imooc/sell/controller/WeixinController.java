package com.imooc.sell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

	@GetMapping("/auth")
	public void auth(@RequestParam("code") String code)
	{
		log.info("进入auth方法");
		log.info("code={}",code);
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx93734849913bedbe&secret=293b41783e4e5a1f2fe01148c20e09d4&code="+code+"&grant_type=authorization_code";
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(url, String.class);
		log.info("response={}",response);
	}
}
