package demo2.springboot.demo.Controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class helloController {
    @RequestMapping("/")
    public String index(){

        return "index";
    }
}
