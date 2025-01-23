package com.enviro.assessment.grad001.MosaMoime.Enviro.controller;


import com.enviro.assessment.grad001.MosaMoime.Enviro.model.WasteCategory;
import com.enviro.assessment.grad001.MosaMoime.Enviro.service.WasteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/wastecategories")
public class WasteController implements IController{


    private WasteService wasteService;

    public WasteController(WasteService wasteService){
        this.wasteService = wasteService;
    }


    // endpoint to get all waste categories
    @GetMapping("")
    @Override
    public List<WasteCategory> getWasteCategories(){
        return wasteService.getWasteServiceCategories();
    }
    // endpoint to get a specific waste category
    @GetMapping("/{id}")
    @Override
    public WasteCategory getWasteCategory(@PathVariable String id){
        try {
            return wasteService.getWasteServiceCategory(Integer.parseInt(id));
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }

    // endpoint to delete a specific waste category
    @DeleteMapping("/{id}")
    @Override
    public void deleteWasteCategory(@PathVariable String id){
        try {
            wasteService.deleteWasteServiceCategory(Integer.parseInt(id));
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }

    // endpoint to add a waste category
    @PostMapping("")
    @Override
    public void addWasteCategory(@RequestBody WasteCategory wasteCategory){
        wasteService.addWasteServiceCategory(wasteCategory);
    }

    // endpoint to update a waste category

    @PutMapping("/{id}")
    @Override
    public void updateWasteCategory(@PathVariable String id, @RequestBody WasteCategory wasteCategory){
        try {
            wasteService.updateWasteServiceCategory(Integer.parseInt(id), wasteCategory);
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }
}
