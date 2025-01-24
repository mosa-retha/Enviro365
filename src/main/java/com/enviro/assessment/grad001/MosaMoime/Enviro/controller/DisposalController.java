package com.enviro.assessment.grad001.MosaMoime.Enviro.controller;

import com.enviro.assessment.grad001.MosaMoime.Enviro.model.WasteCategory;
import com.enviro.assessment.grad001.MosaMoime.Enviro.service.WasteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/disposal")
public class DisposalController implements IController {

    private WasteService wasteService;

    public DisposalController(WasteService wasteService){
        this.wasteService = wasteService;}

    // endpoint to get all waste categories
    @GetMapping("")
    @Override
    public Iterable<WasteCategory> getWasteCategories(){
        return wasteService.getWasteServiceCategories();
    }


    @GetMapping("/{id}")
    @Override
    public WasteCategory getWasteCategory(@PathVariable Integer id){
        try {
            return wasteService.getWasteServiceCategory(id);
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }

    // endpoint to delete a specific waste category
    @DeleteMapping("/{id}")
    @Override
    public void deleteWasteCategory(@PathVariable Integer id){
        try {
            wasteService.deleteWasteServiceCategory(id);
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
    public void updateWasteCategory(@PathVariable Integer id, @RequestBody WasteCategory wasteCategory){
        try {
            wasteService.updateWasteServiceCategory(id, wasteCategory);
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }

}
