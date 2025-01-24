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

        System.out.println(wasteService.getWasteServiceCategories());
        return wasteService.getWasteServiceCategories();
    }

    @GetMapping("/{id}")
    @Override
    public WasteCategory getWasteCategory(@PathVariable Integer id) {
        return wasteService.getWasteServiceCategory(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public void deleteWasteCategory(@PathVariable Integer id) {
        wasteService.deleteWasteServiceCategory(id);
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
