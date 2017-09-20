package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ClientController {

    @Value("${welcome.message}")
    public String value;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String getMessage(){
        return this.value;
    }
}
