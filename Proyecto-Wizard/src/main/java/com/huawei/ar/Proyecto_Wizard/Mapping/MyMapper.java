package com.huawei.ar.Proyecto_Wizard.Mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.huawei.ar.Proyecto_Wizard.Resources.EnvironmentGetter;

public class MyMapper {
	ObjectMapper mapper = new ObjectMapper();
	ObjectWriter ow =  mapper.writer().withDefaultPrettyPrinter();
	
	private final String tokenJsonBody = "{\r\n"
			+ "    \"auth\": {\r\n"
			+ "        \"identity\": {\r\n"
			+ "            \"methods\": [\r\n"
			+ "                \"password\"\r\n"
			+ "            ],\r\n"
			+ "            \"password\": {\r\n"
			+ "                \"user\": {\r\n"
			+ "                    \"name\": \""+EnvironmentGetter.getIamUser()+"\",\r\n"
			+ "                    \"password\": \""+EnvironmentGetter.getPassword()+"\",\r\n"
			+ "                    \"domain\": {\r\n"
			+ "                        \"name\": \""+EnvironmentGetter.getAccountName()+"\"\r\n"
			+ "                    }\r\n"
			+ "                }\r\n"
			+ "            }\r\n"
			+ "        },\r\n"
			+ "        \"scope\": {\r\n"
			+ "            \"project\": {\r\n"
			+ "                \"name\": \""+EnvironmentGetter.getRegion()+"\"\r\n"
			+ "            }\r\n"
			+ "        }\r\n"
			+ "    }\r\n"
			+ "}";
	
	public String getTokenRequestBody (String iamUser, String password, String accountName, String projectId) {
		final String jsonBody = "{\r\n"
					+ "    \"auth\": {\r\n"
					+ "        \"identity\": {\r\n"
					+ "            \"methods\": [\r\n"
					+ "                \"password\"\r\n"
					+ "            ],\r\n"
					+ "            \"password\": {\r\n"
					+ "                \"user\": {\r\n"
					+ "                    \"name\": \""+iamUser+"\",\r\n"
					+ "                    \"password\": \""+password+"\",\r\n"
					+ "                    \"domain\": {\r\n"
					+ "                        \"name\": \""+accountName+"\"\r\n"
					+ "                    }\r\n"
					+ "                }\r\n"
					+ "            }\r\n"
					+ "        },\r\n"
					+ "        \"scope\": {\r\n"
					+ "            \"project\": {\r\n"
					+ "                \"id\": \""+projectId+"\"\r\n"
					+ "            }\r\n"
					+ "        }\r\n"
					+ "    }\r\n"
					+ "}";
		 return jsonBody;	
	}

	public String StartEcsInBatch(String[] ecsList) {
		final String json = "{\r\n"
				+ "    \"os-start\": {\r\n"
				+ "        \"servers\": [\r\n"
				+ "        ]\r\n"
				+ "    }\r\n"
				+ "}";
		return json;
	}
	
	
	public String StopEcsInBatch(String[] ecsList) {
		final String json= "{\r\n"
				+ "    \"os-stop\": {\r\n"
				+ "        \"type\":\"HARD\",\r\n"
				+ "        \"servers\": [\r\n"
				+ 			"\r\n"
				+ "        ]\r\n"
				+ "    }\r\n"
				+ "}";
		return json;
	}
	
	
}
