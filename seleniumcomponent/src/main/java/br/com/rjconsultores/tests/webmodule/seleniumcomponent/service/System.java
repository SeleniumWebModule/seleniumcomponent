package br.com.rjconsultores.tests.webmodule.seleniumcomponent.service;

import java.util.ArrayList;
import java.util.Collection;

public class System {
	private String name;
	private Collection<View> views;
	
	System() {
		views = new ArrayList<View>();
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	Collection<View> getViews() {
		return views;
	}
}
