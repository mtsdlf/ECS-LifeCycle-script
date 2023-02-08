package com.huawei.ar.Proyecto_Wizard.view;

import com.huawei.ar.Proyecto_Wizard.Mapping.MyMapper;
import com.huawei.ar.Proyecto_Wizard.Resources.EnvironmentGetter;

public class JsonBodyContructor {
	private MyMapper map = new MyMapper();
	
	public String getTokenRequestUrl() {
		return "https://iam.myhuaweicloud.com/v3/auth/tokens";
	}
	public String getUrl_AllEcsByTag(){
		return "https://ecs."+EnvironmentGetter.getRegion()+".myhuaweicloud.com/v1/"+EnvironmentGetter.getProjectId()+"/cloudservers/detail?tags="+EnvironmentGetter.getTagKey()+"="+EnvironmentGetter.getTagValue();
	}
	
	public String getUrl_ActionEcs(){
		return "https://ecs."+EnvironmentGetter.getRegion()+".myhuaweicloud.com/v1/"+EnvironmentGetter.getProjectId()+"/cloudservers/action";
	}
	
	public String getTokenRequestBody() {
		return map.getTokenRequestBody(
				EnvironmentGetter.getIamUser(), 
				EnvironmentGetter.getPassword(), 
				EnvironmentGetter.getAccountName(), 
				EnvironmentGetter.getProjectId());
	}
		
}
