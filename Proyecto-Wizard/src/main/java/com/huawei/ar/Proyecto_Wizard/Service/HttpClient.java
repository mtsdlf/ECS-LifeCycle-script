package com.huawei.ar.Proyecto_Wizard.Service;

import okhttp3.OkHttpClient;

public class HttpClient {
	private static OkHttpClient client_instance = null;
	
	   public static OkHttpClient getInstance() {
	        if (client_instance == null)
	            client_instance = new OkHttpClient();
	  
	        return client_instance;
	    }
		
	}

