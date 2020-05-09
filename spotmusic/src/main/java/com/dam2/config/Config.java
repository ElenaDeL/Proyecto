package com.dam2.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class Config {
	
	@Bean 
	public MessageSource messageResource() {
		ReloadableResourceBundleMessageSource m = new ReloadableResourceBundleMessageSource();
		
		m.setBasename("classpath:errors");
		m.setDefaultEncoding("UTF-8");
		
		return m;
	}
	
	@Bean
	public LocalValidatorFactoryBean getValidator() {
		
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageResource());
		return bean;
	}

}
