package com.apitest.services;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apitest.models.UrlModel;
import com.apitest.repositories.UrlRepository;


@Service
public class UrlService {

	@Autowired
	UrlRepository urlRepository;
	
	//Get all urls loaded in repository
	public ArrayList<UrlModel> getAllUrls() {
		return urlRepository.getUrlCollection();
	}
	
	//Get urls filtered by languaje and top n in ranking
	public ArrayList<UrlModel> getFilteredUrls(Integer top, String lang) {			
		return (ArrayList<UrlModel>) urlRepository.getUrlCollection()
				.stream()
				.filter(url -> url.getLanguage().toString().toLowerCase().equals(lang.toString().toLowerCase())) 
				.sorted( (UrlModel v1, UrlModel v2) -> v1.getRank().compareTo(v2.getRank()))
				.limit(top)
				.collect(Collectors.toList());
	}
		
}
