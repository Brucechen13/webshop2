package com.cc.webstore.config;

import com.cc.webstore.action.MainWebController;
import com.cc.webstore.dao.impl.ProductDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 * Created by chenc on 2017/5/5.
 */
@Configuration
@ComponentScan(basePackageClasses = {MainWebController.class, ProductDaoImpl.class})
@EnableWebMvc
public class WebStoreConfig extends WebMvcConfigurerAdapter{

    @Bean
    public ViewResolver viewResolver(){
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
        viewResolver.setSuffix(".ftl");
        viewResolver.setExposeContextBeansAsAttributes(true);
        viewResolver.setContentType("text/html;charset=UTF-8");
        return viewResolver;
    }

    @Bean
    public ProductDaoImpl productDao(){
        return new ProductDaoImpl();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
