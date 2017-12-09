package com.bucky.crazy.controller;

import com.bucky.crazy.configurations.Routes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dang Dim
 * Date     : 08-Dec-17, 1:13 PM
 * Email    : d.dim@gl-f.com
 */
@RestController
public class HomeController {
    @RequestMapping(value = Routes.HOME,method = RequestMethod.GET)
    public String index(){
        return "hello";
    }

}
