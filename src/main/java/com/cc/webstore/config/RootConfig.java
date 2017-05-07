package com.cc.webstore.config;

import com.cc.webstore.action.MainWebController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.Properties;

/**
 * Created by chenc on 2017/5/7.
 */
@Configuration
@ComponentScan(basePackageClasses = {MainWebController.class})
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
}
