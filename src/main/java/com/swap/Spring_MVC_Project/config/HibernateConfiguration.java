package com.swap.Spring_MVC_Project.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.swap.Spring_MVC_Project.entity.Employee;

@Configuration
public class HibernateConfiguration {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/empdetails");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("Root@123");
		return driverManagerDataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean getlLocalSessionFactoryBean() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(getDataSource());
		sessionFactoryBean.setAnnotatedClasses(Employee.class);
		Properties properties = new Properties();
		properties.put("show_sql", "true");
		properties.put("dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.put("hbm2ddl.auto", "update");
		sessionFactoryBean.setHibernateProperties(properties);
		return sessionFactoryBean;
	}
}
