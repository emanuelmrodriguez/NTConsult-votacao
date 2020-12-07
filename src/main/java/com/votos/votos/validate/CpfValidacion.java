package com.votos.votos.validate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CpfValidacion  {
	
	
	public static boolean validar (String cpf) {
		try {
			String url = "https://user-info.herokuapp.com/users/"+cpf;
	        URL urlObj;
			
				urlObj = new URL(url);
			
	        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
	
	        connection.setRequestMethod("GET");
	        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
	
	        System.out.println("Send 'HTTP GET' request to : " + url);
	
	        Integer responseCode = connection.getResponseCode();
	        System.out.println("Response Code : " + responseCode);
	
	        if (responseCode == HttpURLConnection.HTTP_OK) {
	            BufferedReader inputReader = new BufferedReader(
	                new InputStreamReader(connection.getInputStream()));
	            String inputLine;
	            StringBuffer response = new StringBuffer();
	
	            while ((inputLine = inputReader.readLine()) != null) {
	                response.append(inputLine);
	            }
	
	            inputReader.close();
	
	            return true;
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false ;
		
    
	}
}
