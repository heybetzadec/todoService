package com.todo.rest.service.restfulwebservice.basic;

import com.todo.rest.service.restfulwebservice.basic.AuthenticationBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class BasicAuthentationController {

    @GetMapping(path = "/basicauthin")
    public AuthenticationBean authenticationBean(){
        return new AuthenticationBean("You are authenticated");
    }

}
