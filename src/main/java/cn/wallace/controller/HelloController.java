package cn.wallace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(ModelMap map) {
        map.addAttribute("message","welcome to use idea.");
        return "hello";
    }
}
