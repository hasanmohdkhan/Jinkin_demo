package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created: 19/07/2022
 * @author: hasan.khan
 */

@RestController
public class Controller {


    @GetMapping(value = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)

    public List<String> getGreetings() {
        System.out.println("called by API...");
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("World");
        return list;

    }
}
