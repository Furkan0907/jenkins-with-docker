package com.jenkinswithdocker.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public Map<String, String> getTestData() {
        return Map.of(
                "mesaj", "Docker ve Jenkins testi basarili!",
                "durum", "Aktif",
                "proje", "Mini Backend Testi"
        );
    }
}
