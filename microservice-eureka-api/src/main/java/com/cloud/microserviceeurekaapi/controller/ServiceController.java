package com.cloud.microserviceeurekaapi.controller;

import org.apache.tomcat.util.http.FastHttpDateFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("queryStr")
    String queryStr(@PathVariable String value){
        return FastHttpDateFormat.getCurrentDate();
    }
}
