package com.java.wiki.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Test {

    //@RequestMapping("/hello")
    @GetMapping("/hello")
    //@PostMapping
    //@PutMapping
    //@DeleteMapping
    //@RequestMapping(method = RequestMethod.GET , value = "/hello")
    public String Hello(){
        return "Hello World";
    }
}
