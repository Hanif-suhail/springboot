package com.example.Springboot_first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @GetMapping("/data")
    public String getMessage(){
        return "This is message from pod";
    }

}
