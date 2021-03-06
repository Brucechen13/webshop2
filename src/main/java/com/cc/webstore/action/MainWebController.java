package com.cc.webstore.action;

import com.cc.webstore.beans.Product;
import com.cc.webstore.dao.impl.JdbcBaseDaoImpl;
import com.cc.webstore.dao.impl.ProductDaoImpl;
import com.cc.webstore.dao.service.ProductMananger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chenc on 2017/5/5.
 */
@Component("MainAction")
@RequestMapping("/index")
public class MainWebController implements Controller{

    @Autowired
    private ProductMananger productManager;

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("products", productManager.getAllProducts());
        System.out.println(productManager.getAllProducts().size());
        return mv;
    }
}
