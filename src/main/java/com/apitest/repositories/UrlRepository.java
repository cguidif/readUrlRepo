package com.apitest.repositories;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.apitest.models.UrlModel;



@Repository
public class UrlRepository {
	
	ArrayList<UrlModel> urlCollection = new ArrayList<UrlModel>();
	 
	public UrlRepository() throws Throwable {
		String link = "https://raw.githubusercontent.com/EvanLi/Github-Ranking/master/Data/github-ranking-2018-12-18.csv";
		URL urlFile = new URL(link);
		
        BufferedReader in = new BufferedReader( new InputStreamReader(urlFile.openStream()));

        String inputLine;       
        boolean header = true;
        
        while ((inputLine = in.readLine()) != null)
            
        	if (header) {
        		header = false;
        	}else {  		
		        		String[] parsedLine = inputLine.split(",");
		        		UrlModel urldata = new UrlModel();
		        		
		        		urldata.setRank(Integer.parseInt(parsedLine[0]));
		        		urldata.setItem(parsedLine[1]);
		        		urldata.setRepo_name(parsedLine[2]);
		        		urldata.setStars(Integer.parseInt(parsedLine[3]));
		        		urldata.setForks(Integer.parseInt(parsedLine[4]));
		        		urldata.setLanguage((parsedLine[5].equals(null)?"-":parsedLine[5]));
		        		urldata.setRepo_url(parsedLine[6]);
		        		urldata.setUsername(parsedLine[7]);
		        		urldata.setIssues(Integer.parseInt(parsedLine[8]));
		        		urldata.setLast_commit(parsedLine[9]);
		        		//urldata.setDescription((parsedLine[10].equals(null)?"-":parsedLine[10]));

		        		this.urlCollection.add(urldata);
	        		
		        		//System.out.println(urldata.toString());
        	}
              
        in.close();
	}
		
	public ArrayList<UrlModel> getUrlCollection() {
		return urlCollection;
	}

	public void setUrlCollection(ArrayList<UrlModel> urlCollection) {
		this.urlCollection = urlCollection;
	}
 
}
