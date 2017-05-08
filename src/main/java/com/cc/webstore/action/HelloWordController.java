package com.cc.webstore.action;

import com.cc.webstore.beans.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * Created by chenc on 2017/5/3.
 */
@Component
@RequestMapping("/hello")
public class HelloWordController implements Controller{
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("test");
        Product product = new Product();
        product.setProductName("耳机");
        product.setImageUrl("http://www.baidu.com");
        mv.addObject("product", product);
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegist(
            @RequestPart("picture") byte[] picture
    ){
        return "test";
    }
}
