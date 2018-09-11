package ei.aliyun.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public String hello(String name){
        System.out.println("====="+name+"=====");
        return "ok";
    }
}
