package com.yygg.serviceA;

import com.yygg.api.ServiceAInterface;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController implements ServiceAInterface {
    public String sayHello(@PathVariable("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age) {
        System.out.println("打招呼，id=" + id + ", name=" + name + ", age=" + age);
        return "{'msg': 'hello, " + name + "'}";
    }

    @Override
    public String welcome(String name) {
        if(name.equals("crh")){
            System.out.println("hi"+name);
            return "welcome crh";
        }
        else {
            return "请注册你的姓名"+name;
        }
    }


}
