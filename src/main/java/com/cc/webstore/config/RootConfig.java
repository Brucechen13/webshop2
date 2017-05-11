package com.cc.webstore.config;

import com.cc.webstore.action.MainWebController;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by chenc on 2017/5/7.
 */
@Configuration
@ComponentScan(basePackages = "com.cc.webstore")
public class RootConfig {
    @Bean
    public FreeMarkerConfigurer freemarkerConfig(){
        FreeMarkerConfigurer freemarkerConfig = new FreeMarkerConfigurer();
        freemarkerConfig.setTemplateLoaderPath("/WEB-INF/templates/");
        Properties prop = new Properties();
        prop.setProperty("template_update_delay","0");
        prop.setProperty("datetime_format", "yyyy-MM-dd HH:mm:ss");
        prop.setProperty("classic_compatible", "true");
        prop.setProperty("template_exception_handler","ignore");
        prop.setProperty("default_encoding", "UTF-8");
        freemarkerConfig.setFreemarkerSettings(prop);
        return freemarkerConfig;
    }

    @Bean
    public MultipartResolver multipartResolver() throws IOException{
        return new StandardServletMultipartResolver();
    }

    @Bean
    public  DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/webshop");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
