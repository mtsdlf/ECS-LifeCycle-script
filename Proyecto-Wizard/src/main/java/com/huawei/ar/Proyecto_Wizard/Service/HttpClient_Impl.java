package com.huawei.ar.Proyecto_Wizard.Service;

import java.io.IOException;

import com.huawei.ar.Proyecto_Wizard.Resources.EnvironmentGetter;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
public class HttpClient_Impl {
	private OkHttpClient client = HttpClient.getInstance();

	public Response PostRequest(String url, RequestBody body) {
	    Request request = new Request.Builder()
	    		.url(url)
	    		.post(body)
	    		.build();
	    Call call = client.newCall(request);
	    Response response = null;
	    try {
			response = call.execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return response;
	}
	
	public Response postRequest(String url, RequestBody body, String token) {
	    Request request = new Request.Builder()
	    		.url(url)
	    		.addHeader("X-Auth-Token", token)
	    		.post(body)
	    		.build();
	    Call call = client.newCall(request);
	    Response response = null;
	    try {
			response = call.execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return response;
	}
	
	public Response getRequest(String url, String token) {
	    Request request = new Request.Builder()
	    		.url(url)
	    		.addHeader("X-Auth-Token", token)
	    		.build();
	    Call call = client.newCall(request);
	    Response response = null;
	    try {
			response = call.execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return response;
	}
}