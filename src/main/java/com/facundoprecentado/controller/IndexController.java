package com.facundoprecentado.controller;

import com.facundoprecentado.domain.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String newClient(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("client", new Client());
        return "index";
    }
}
