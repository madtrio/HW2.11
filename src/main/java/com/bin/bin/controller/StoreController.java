package com.bin.bin.controller;

import com.bin.bin.service.StoreService;
import com.bin.bin.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> ids) {
        storeService.add(ids);
    }
    @GetMapping("/get")
    public Set<Item> get(){
        return (Set<Item>) storeService.get();
    }
}
