package com.example.mycrud.controller;

import com.example.mycrud.model.Item;
import com.example.mycrud.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/items")

public class ItemController {
    @Autowired
    private ItemService service;

    @GetMapping
    public List<Item> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return service.getItemById(id).orElseThrow(() -> new RuntimeException("Item not found"));
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return service.createItem(item);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item item) {
        return service.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
    }
}
