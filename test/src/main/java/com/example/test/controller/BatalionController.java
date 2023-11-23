package com.example.test.controller;


import com.example.test.manager.BatalionManager;
import com.example.test.model.Batalion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batalion")
public class BatalionController {

    @GetMapping
    public Batalion getBatalionInfo() {
        BatalionManager manager = BatalionManager.getInstance();
        return manager.getBatalion();
    }
}

