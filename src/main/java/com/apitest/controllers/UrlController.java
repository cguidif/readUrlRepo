package com.apitest.controllers;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apitest.models.UrlModel;
import com.apitest.services.UrlService;

@RestController
@RequestMapping("/urls")
public class UrlController {
	
	@Autowired
	UrlService urlService;
	
	@GetMapping()
	public ArrayList<UrlModel> getUlsByParams(){
		return urlService.getAllUrls();			
	}

	@GetMapping(path = "/query")
	public ArrayList<UrlModel> getUrlsFiltered2(@RequestParam("top") Integer top, @RequestParam("lang") String lang){
		return urlService.getFilteredUrls(top,lang);
	}

}
