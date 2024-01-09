package org.crnts.collagedatamvc.config;

import java.util.Properties;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySources(value = { @PropertySource(value = "classpath:application.properties") })
public class HibernateConfig {

	@Autowired
	private Environment environment;

	@Bean
	public Properties hibernateProperties() {
		Properties propertice = new Properties();
		propertice.put("hibernate.dialect", environment.getRequiredProperty("dialect"));
		propertice.put("hibernate.show_sql", environment.getRequiredProperty("show_sql"));
		propertice.put("hibernate.format_sql", environment.getRequiredProperty("format_sql"));
		propertice.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hbm2ddl.auto"));

		return propertice;
	}

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("driver"));
		dataSource.setUrl(environment.getRequiredProperty("url"));
		dataSource.setUsername(environment.getRequiredProperty("user"));
		dataSource.setPassword(environment.getRequiredProperty("password"));
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setHibernateProperties(hibernateProperties());
	//	sessionFactory.setPackagesToScan("org.crnts.studentdatamanagement.entity");
		sessionFactory.setPackagesToScan(new String[] { " org.crnts.collagedatamvc.entity" });
		return sessionFactory;
	}
	@Bean
	public HibernateTemplate hibernateTemplates() {
		HibernateTemplate template = new HibernateTemplate(getSessionFactory().getObject());
		return template;
	}
	@Bean

	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}

}

