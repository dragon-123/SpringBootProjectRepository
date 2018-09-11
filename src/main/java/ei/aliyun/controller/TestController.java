package ei.aliyun.controller;

import ei.aliyun.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping(value = "/hello",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public String testHello(User user){
        System.out.println("========="+user.toString()+"=========");

        return "user";
    }
}
