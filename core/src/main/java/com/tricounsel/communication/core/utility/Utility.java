package com.tricounsel.communication.core.utility;

import java.util.Map;

public class Utility {
	
	public static final String putParamsInTemplate(String template,Map<String, String> params){
		for(Map.Entry<String, String> param:params.entrySet()){
			template.replaceAll(
					new StringBuilder().append("{")
					.append(param.getKey())
					.append("}").toString()
					, param.getValue()
			);
		}
		return template;
	}
}
