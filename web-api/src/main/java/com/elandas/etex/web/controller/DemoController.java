package com.elandas.etex.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



        @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
        public String sayHello() {
            return "Swagger Hello World";
        }
}
