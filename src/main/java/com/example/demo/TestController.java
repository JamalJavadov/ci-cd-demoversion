package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @PostMapping("/create")
    public String create(@RequestBody ObjectItemDto objectItemDto) {
        return testService.createOb(objectItemDto);
    }
}
