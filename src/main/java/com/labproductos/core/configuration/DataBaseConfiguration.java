package com.labproductos.core.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataBaseConfiguration {
		@Bean
		public DataSource getDataSource () {
			DriverManagerDataSource datasource = new DriverManagerDataSource();
			datasource.setDriverClassName("com.mysql.jdbc.Driver");
			datasource.setUrl("jdbc:mysql://localhost/productos2018");
			datasource.setUsername("root");
			datasource.setPassword("root");
			return datasource;
		}
		public Properties getHibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
			properties.put("hibernate.dialect.storage_engine", "InnoDB");
			properties.put("show_sql", "true");
			return null;
		}
		@Bean
		public LocalSessionFactoryBean getSessionFactory() {
			LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
			localSessionFactoryBean.setDataSource(getDataSource());
			localSessionFactoryBean.setPackagesToScan("com.labproductos.core.model");
			localSessionFactoryBean.setHibernateProperties(getHibernateProperties());
			return localSessionFactoryBean;
		}
		@Bean
		@Autowired
		public HibernateTransactionManager getTransactionManager () {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager();
			transactionManager.setSessionFactory(getSessionFactory().getObject());
			return transactionManager;
		}
		
}
