package com.enviro.assessment.grad001.MosaMoime.Enviro.controller;

import com.enviro.assessment.grad001.MosaMoime.Enviro.model.WasteCategory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Interface for Waste Category Controller.
 * Provides endpoints for managing waste categories.
 * ADD @RequestMapping("/THE_PATH_YOU_WANT_TO_USE") TO THE CLASS
 * ADD @GetMapping("") TO THE METHOD THAT RETURNS A LIST OF WASTE CATEGORIES
 */

public interface IController {

    /**
     * endpoint to get all waste categories.
     * @return List of WasteCategory
     */
    @GetMapping("")
    public List<WasteCategory> getWasteCategories();

    /**
     * endpoint to get a specific waste category by ID.
     * @param id The ID of the waste category
     * @return WasteCategory
     */
    @GetMapping("/{id}")
    public WasteCategory getWasteCategory(@PathVariable String id);

    /**
     * endpoint to delete a specific waste category by ID.
     * @param id The ID of the waste category
     */
    @DeleteMapping("/{id}")
    public void deleteWasteCategory(@PathVariable String id);

    /**
     * endpoint to add a new waste category.
     * @param wasteCategory The waste category to add
     */
    @PostMapping("")
    public void addWasteCategory(@RequestBody WasteCategory wasteCategory);

    /**
     * endpoint to update an existing waste category by ID.
     * @param id The ID of the waste category
     * @param wasteCategory The updated waste category
     */
    @PutMapping("/{id}")
    public void updateWasteCategory(@PathVariable String id, @RequestBody WasteCategory wasteCategory);
}