package com.cc.webstore.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chenc on 2017/5/7.
 */

@Controller
@RequestMapping("/detail")
public class DetailController {

    @RequestMapping(method = RequestMethod.GET)
    public String getDetail(Model model){
        return "index";
    }
}
