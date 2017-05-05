package com.cc.webstore.config;

import com.cc.webstore.action.MainWebController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.Properties;

/**
 * Created by chenc on 2017/5/5.
 */
@Configuration
@ComponentScan(basePackageClasses = {MainWebController.class})
public class WebStoreConfig {

    @Bean
    public static FreeMarkerConfigurer freemarkerConfig(){
        FreeMarkerConfigurer freemarkerConfig = new freemarkerConfig();
        freemarkerConfig.setTemplateLoaderPath("/WEB-INF/templates/");
        Properties prop = new Properties();
        prop.setProperty("default_encoding", "UTF-8");
        freemarkerConfig.setFreemarkerSettings(prop);
        return freemarkerConfig;
    }
}
