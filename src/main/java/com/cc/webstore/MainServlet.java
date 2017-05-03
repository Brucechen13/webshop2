package com.cc.webstore;

import com.cc.webstore.beans.Product;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chenc on 2017/5/3.
 */

@WebServlet("/hello")
public class MainServlet extends HttpServlet{
    private Configuration cfg;
    @Override
    public void init() throws ServletException {
        //initialize operation
        cfg=new Configuration(Configuration.VERSION_2_3_25);
        cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        Product root = new Product();
        //得到模板
        try {
            //将模板和数据结合，并返回浏览器
            Template template=cfg.getTemplate("test.ftl");
            template.process(root, resp.getWriter());
        } catch (Exception e) {
            //e.printStackTrace();
            resp.getWriter().print("暂时无数据");
        }
    }
}
