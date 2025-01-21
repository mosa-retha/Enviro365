package com.enviro.assessment.grad001.MosaMoime.Enviro.controller;

import com.enviro.assessment.grad001.MosaMoime.Enviro.service.WasteCategory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ADD @
public interface IController {
    // endpoint to get all waste categories
    @GetMapping("")
    public List<WasteCategory> getWasteCategories();

    // endpoint to get a specific waste category
    @GetMapping("/{id}")
    public WasteCategory getWasteCategory(@PathVariable String id);

    // endpoint to delete a specific waste category
    @DeleteMapping("/{id}")
    public void deleteWasteCategory(@PathVariable String id);

    // endpoint to add a waste category
    @PostMapping("")
    public void addWasteCategory(@RequestBody WasteCategory wasteCategory);

    // endpoint to update a waste category
    @PutMapping("/{id}")
    public  void updateWasteCategory(@PathVariable String id, @RequestBody WasteCategory wasteCategory);
}
