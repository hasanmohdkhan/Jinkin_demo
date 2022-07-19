package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created: 19/07/2022
 * @author: hasan.khan
 */

@RestController
public class Controller {


    @GetMapping("/hello")
    public String getGreetings() {
        System.out.println("called by API...");
        return "hello";
    }
}
