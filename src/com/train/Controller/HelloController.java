package com.train.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/hello")
public class HelloController {
 
    @RequestMapping(value="/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name, ModelMap model){
        model.addAttribute("name", name);
        return "list";
    }
 
}