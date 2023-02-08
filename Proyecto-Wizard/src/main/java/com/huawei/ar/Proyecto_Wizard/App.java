package com.huawei.ar.Proyecto_Wizard;

import java.io.IOException;

import com.huawei.ar.Proyecto_Wizard.Service.HttpClient_Impl;
import com.huawei.ar.Proyecto_Wizard.view.JsonBodyContructor;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

public class App {
	

    public static void main( String[] args )  {
    	JsonBodyContructor jsons = new JsonBodyContructor();
    	HttpClient_Impl client = new HttpClient_Impl();
    	
		String tokenUrl = jsons.getTokenRequestUrl();
		String ecsQueryUrl = jsons.getUrl_AllEcsByTag();
		String ecsActionUrl = jsons.getUrl_ActionEcs();
		
		RequestBody tokenBody = RequestBody.create(jsons.getTokenRequestBody(),MediaType.parse("application/json"));
		
		Response response = client.PostRequest(tokenUrl, tokenBody);
		String token = response.headers().get("X-Subject-Token");
		
		Response response2 = client.getRequest(ecsQueryUrl, token);

    }
}
