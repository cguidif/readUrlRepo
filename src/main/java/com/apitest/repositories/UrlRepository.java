package com.apitest.repositories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public class UrlRepository {
	 
	public UrlRepository() throws Throwable {
		String link = "https://raw.githubusercontent.com/EvanLi/Github-Ranking/master/Data/github-ranking-2018-12-18.csv";
		URL urlFile = new URL(link);
		
        BufferedReader in = new BufferedReader( new InputStreamReader(urlFile.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            
        	//mepear a objeto
        	System.out.println(inputLine);
        in.close();
	}
 
}


/*
@Repository
public class UrlRepository {
	 
	public UrlRepository() throws Throwable {
		String link = "https://raw.githubusercontent.com/EvanLi/Github-Ranking/master/Data/github-ranking-2018-12-18.csv";
		URL crunchifyUrl = new URL(link);
		HttpURLConnection crunchifyHttp = (HttpURLConnection) crunchifyUrl.openConnection();
		Map<String, List<String>> crunchifyHeader = crunchifyHttp.getHeaderFields();
 
		// If URL is getting 301 and 302 redirection HTTP code then get new URL link.
		// This below for loop is totally optional if you are sure that your URL is not getting redirected to anywhere
		for (String header : crunchifyHeader.get(null)) {
			if (header.contains(" 302 ") || header.contains(" 301 ")) {
				link = crunchifyHeader.get("Location").get(0);
				crunchifyUrl = new URL(link);
				crunchifyHttp = (HttpURLConnection) crunchifyUrl.openConnection();
				crunchifyHeader = crunchifyHttp.getHeaderFields();
			}
		}
		InputStream crunchifyStream = crunchifyHttp.getInputStream();
		String crunchifyResponse = crunchifyGetStringFromStream(crunchifyStream);
		System.out.println(crunchifyResponse);
	}
 
        // ConvertStreamToString() Utility - we name it as crunchifyGetStringFromStream()
	private static String crunchifyGetStringFromStream(InputStream crunchifyStream) throws IOException {
		if (crunchifyStream != null) {
			Writer crunchifyWriter = new StringWriter();
 
			char[] crunchifyBuffer = new char[2048];
			try {
				Reader crunchifyReader = new BufferedReader(new InputStreamReader(crunchifyStream, "UTF-8"));
				int counter;
				while ((counter = crunchifyReader.read(crunchifyBuffer)) != -1) {
					crunchifyWriter.write(crunchifyBuffer, 0, counter);
				}
			} finally {
				crunchifyStream.close();
			}
			return crunchifyWriter.toString();
		} else {
			return "No Contents";
		}
	}
}
*/
