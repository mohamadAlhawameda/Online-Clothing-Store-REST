package com.cpan252.clotheswarehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClotheswarehouseController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
