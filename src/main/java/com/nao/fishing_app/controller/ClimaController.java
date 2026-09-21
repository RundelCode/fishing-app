package com.nao.fishing_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/climas")
public class ClimaController {

    @GetMapping
    public String test() {
        return "ClimaController";
    }

}