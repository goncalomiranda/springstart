package com.in28minutes.spring.basics.springin5steps.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	@Autowired
	private ComponentJdbcConnection jdbc;

	public ComponentJdbcConnection getJdbc() {
		return jdbc;
	}

	public void setJdbc(ComponentJdbcConnection jdbc) {
		this.jdbc = jdbc;
	}
	
	
}
