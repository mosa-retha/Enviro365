package com.enviro.assessment.grad001.MosaMoime.Enviro.controller;

import com.enviro.assessment.grad001.MosaMoime.Enviro.model.WasteCategory;
import com.enviro.assessment.grad001.MosaMoime.Enviro.service.WasteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recycling")
public class RecyclingController implements IController{

    private WasteService wasteService;

    public RecyclingController(WasteService wasteService){
        this.wasteService = wasteService;
    }

    @GetMapping("")
    @Override
    public Iterable<WasteCategory> getWasteCategories() {
        return wasteService.getWasteServiceCategories("recycling");

    }

    @GetMapping("/{id}")
    @Override
    public WasteCategory getWasteCategory(@PathVariable Integer id) {
        return wasteService.getWasteServiceCategory(id, "recycling");
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteWasteCategory(@PathVariable Integer id) {
        wasteService.deleteWasteServiceCategory(id, "recycling");
    }

    @PostMapping("")
    @Override
    public void addWasteCategory(@RequestBody WasteCategory wasteCategory) {
        wasteService.addWasteServiceCategory(wasteCategory);
    }

    @PutMapping("/{id}")
    @Override
    public void updateWasteCategory(Integer id, WasteCategory wasteCategory) {
        wasteService.updateWasteServiceCategory(id, wasteCategory);
    }
}
