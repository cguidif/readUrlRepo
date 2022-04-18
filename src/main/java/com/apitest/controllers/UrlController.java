package com.apitest.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apitest.models.UrlModel;
import com.apitest.services.UrlService;

@RestController
@RequestMapping("/urls")
public class UrlController {
	
	@Autowired
	UrlService urlService;
	
	@GetMapping(path = "/{num}/{lang}")
	public ArrayList<UrlModel> getUlsByParams(@PathVariable("num") Integer num, @PathVariable("lang") String lang){
		return urlService.getUlsByParams(num,lang);			
	}
	
}
