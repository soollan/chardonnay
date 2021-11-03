package com.chardonnay.chardonnay.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String hello() {
        return "hello";
    }

    @GetMapping("hello") // GET, POST 할 때 그 GET
    public String hello(Model model) {
        model.addAttribute("data", "hello!"); // hello.html로 넘어갈 데이터
        return "hello"; // resources/templates/hello.html로 연결하라는 뜻이다.
    }
}
