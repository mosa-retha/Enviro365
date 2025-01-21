package com.enviro.assessment.grad001.MosaMoime.Enviro.controller;


import com.enviro.assessment.grad001.MosaMoime.Enviro.service.WasteCategory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/wastecategories")
public class WasteController implements IController{

    // placeholder for the database
    List<WasteCategory> db = List.of(
        new WasteCategory("1", "Plastic", "Plastic waste is waste material that contains plastic. These materials are generally synthetic and semi-synthetic organic polymers."),
        new WasteCategory("2", "Paper", "Paper waste is a general term for the various kinds of paper that can be recycled."),
        new WasteCategory("3", "Glass", "Glass waste is waste that is comprised of glass products and glass containers."),
        new WasteCategory("4", "Metal", "Metal waste is waste that is comprised of metal products and metal containers."),
        new WasteCategory("5", "Organic", "Organic waste is waste that is comprised of organic materials such as food waste, garden waste, and paper waste."),
        new WasteCategory("6", "E-waste", "E-waste is waste that is comprised of electronic products that are no longer in use."),
        new WasteCategory("7", "Hazardous", "Hazardous waste is waste that poses substantial or potential threats to public health or the environment.")
    );

    // endpoint to get all waste categories
    @GetMapping("")
    @Override
    public List<WasteCategory> getWasteCategories(){
        return db;
    }
    // endpoint to get a specific waste category
    @GetMapping("/{id}")
    @Override
    public WasteCategory getWasteCategory(@PathVariable String id){
        try {
            return db.get(Integer.parseInt(id));
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }

    // endpoint to delete a specific waste category
    @DeleteMapping("/{id}")
    @Override
    public void deleteWasteCategory(@PathVariable String id){
        try {
            db.remove(Integer.parseInt(id));
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }

    // endpoint to add a waste category
    @PostMapping("")
    @Override
    public void addWasteCategory(@RequestBody WasteCategory wasteCategory){
        db.add(wasteCategory);
    }

    // endpoint to update a waste category

    @PutMapping("/{id}")
    @Override
    public void updateWasteCategory(@PathVariable String id, @RequestBody WasteCategory wasteCategory){
        try {
            db.set(Integer.parseInt(id), wasteCategory);
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Waste category not found", e);
        }
    }


}
