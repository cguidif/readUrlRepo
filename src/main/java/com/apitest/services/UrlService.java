package com.apitest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apitest.models.UrlModel;
import com.apitest.repositories.UrlRepository;


@Service
public class UrlService {

	@Autowired
	UrlRepository urlRepository;
	
	public ArrayList<UrlModel> getUlsByParams(Integer num, String lang) {
		return urlRepository.getSortedFilteredUrlCollection(num, lang);
	}
	
}
