package com.cc.webstore;

import freemarker.cache.WebappTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletContext;
import java.io.IOException;

/**
 * Created by chenc on 2017/5/3.
 */
public class GlobalConfig {

    private static Configuration cfg;

    public static Configuration config(ServletContext servletContext){
        if(cfg == null) {
            cfg = new Configuration(Configuration.VERSION_2_3_25);

            // Specify the source where the template files come from. Here I set a
            // plain directory for it, but non-file-system sources are possible too:
                WebappTemplateLoader templateLoader = new WebappTemplateLoader(servletContext, "WEB-INF/templates");
                templateLoader.setURLConnectionUsesCaches(false);
                templateLoader.setAttemptFileAccess(false);
                cfg.setTemplateLoader(templateLoader);

            cfg.setDefaultEncoding("UTF-8");

            // Sets how errors will appear.
            // During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

            // Don't log exceptions inside FreeMarker that it will thrown at you anyway:
            cfg.setLogTemplateExceptions(false);
        }
        return cfg;
    }
}
