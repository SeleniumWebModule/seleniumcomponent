package br.com.rjconsultores.tests.webmodule.seleniumcomponent.service;

import java.util.Collection;
import java.util.Map;

import br.com.rjconsultores.tests.webmodule.seleniumcomponent.enums.AttributeKey;
import br.com.rjconsultores.tests.webmodule.seleniumcomponent.enums.Rule;

public class View {
	private Map<AttributeKey, String> attributes;
	private Collection<Rule> rulesPosLoad;
	private Collection<Rule> rulesPreLoad;
	private Collection<Component> components;
	
	public Map<AttributeKey, String> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Map<AttributeKey, String> attributes) {
		this.attributes = attributes;
	}
	
	public Collection<Rule> getRulesPosLoad() {
		return rulesPosLoad;
	}

	public void setRulesPosLoad(Collection<Rule> rulesPosLoad) {
		this.rulesPosLoad = rulesPosLoad;
	}

	public Collection<Rule> getRulesPreLoad() {
		return rulesPreLoad;
	}

	public void setRulesPreLoad(Collection<Rule> rulesPreLoad) {
		this.rulesPreLoad = rulesPreLoad;
	}

	public Collection<Component> getComponents() {
		return components;
	}

	public void setComponents(Collection<Component> components) {
		this.components = components;
	}
}
