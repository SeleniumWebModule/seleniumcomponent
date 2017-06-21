package br.com.rjconsultores.tests.webmodule.seleniumcomponent.service;

import java.util.Collection;
import java.util.Map;

import br.com.rjconsultores.tests.webmodule.seleniumcomponent.enums.AttributeKey;
import br.com.rjconsultores.tests.webmodule.seleniumcomponent.enums.Event;

public class Component {
	private Map<AttributeKey, String> attributes; 
	private Collection<Event> events;
	
	public Map<AttributeKey, String> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Map<AttributeKey, String> attributes) {
		this.attributes = attributes;
	}

	public Collection<Event> getEvents() {
		return events;
	}

	public void setEvents(Collection<Event> events) {
		this.events = events;
	}
}
