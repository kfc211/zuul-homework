package com.yygg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ServiceB/user")
public class ServiceBController {
    @Autowired
    private ServiceAClient serviceA;

    @RequestMapping(value = "/sayHello/{id}", method = RequestMethod.GET)
    public String greeting(@PathVariable("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age) {
        System.out.println("sayHello");
        return serviceA.sayHello(id, name, age);
    }
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String seeing(@RequestParam("name") String name){
        return serviceA.welcome(name);
    }
}
