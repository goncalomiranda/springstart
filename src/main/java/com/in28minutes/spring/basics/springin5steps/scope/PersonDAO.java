package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
	
	@Autowired
	private JdbcConnection jdbc;

	public JdbcConnection getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcConnection jdbc) {
		this.jdbc = jdbc;
	}
	
	
}
