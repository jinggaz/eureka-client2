package com.dong.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClient2Controller {
	
	@RequestMapping(value = "recommended")
	public String readingList()	{
		return "1111111111111. Java Professional";
	}
	
	@RequestMapping(value = "recommended2")
	public String readingList2()	{
		return "222222222222. Java Master";
	}
	
}
