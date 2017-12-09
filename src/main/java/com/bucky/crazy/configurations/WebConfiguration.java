package com.bucky.crazy.configurations;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by Dang Dim
 * Date     : 09-Dec-17, 1:01 PM
 * Email    : d.dim@gl-f.com
 */
@Configuration
@EnableTransactionManagement
public class WebConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(environment.getProperty("bucky.db.driver"));
        ds.setUrl(environment.getProperty("bucky.db.url"));
        ds.setUsername("bucky.db.username");
        ds.setPassword("bucky.db.password");
        return ds;
    }

    public Properties getHibernateProperties(){
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", environment.getProperty("bucky.hibernate.dialect"));
        hibernateProperties.put("hibernate.hbm2ddl.auto", environment.getProperty("bucky.hibernate.hbm2ddl.auto"));
        hibernateProperties.put("hibernate.show_sql", environment.getProperty("bucky.hibernate.show_sql"));
        return hibernateProperties;
    }
}
