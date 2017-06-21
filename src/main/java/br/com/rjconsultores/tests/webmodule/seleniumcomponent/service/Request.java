package br.com.rjconsultores.tests.webmodule.seleniumcomponent.service;

import com.google.gson.Gson;

public class Request {
	private System system;
	
	public Request() {
		system = new System();
	}
	
	public System getSystem() {
		return system;
	}
	
	public void setSystemName(String name) {
		system.setName(name);
	}
	
	public void addView(View view) {
		system.getViews().add(view);
	}
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
}
