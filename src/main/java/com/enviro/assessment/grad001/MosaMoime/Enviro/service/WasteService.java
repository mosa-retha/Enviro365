package com.enviro.assessment.grad001.MosaMoime.Enviro.service;

import com.enviro.assessment.grad001.MosaMoime.Enviro.Repository.WasteRespostory;
import com.enviro.assessment.grad001.MosaMoime.Enviro.model.WasteCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

@Service
public class WasteService {
    // placeholder for the database

    private WasteRespostory wasteRespostory;
    @Autowired
    public WasteService(WasteRespostory wasteRespostory){
        this.wasteRespostory = wasteRespostory;
    }

    public WasteService(){
     }


    public Iterable<WasteCategory> getWasteServiceCategories(){
        return wasteRespostory.findAll();
    }

    public WasteCategory getWasteServiceCategory(Integer id){
        return wasteRespostory.findById(id).orElse(null);
    }

    public void addWasteServiceCategory(WasteCategory wasteCategory){
        wasteRespostory.save(wasteCategory);
    }

    public void deleteWasteServiceCategory(Integer id){
        wasteRespostory.deleteById(id);
    }

    public void updateWasteServiceCategory(Integer id, WasteCategory wasteCategory){
        WasteCategory newWasteCate = wasteRespostory.findById(id).orElseThrow(IndexOutOfBoundsException::new);
        newWasteCate.setCategory(wasteCategory.getCategory());
        newWasteCate.setDescription(wasteCategory.getDescription());
        newWasteCate.setCategoryType(wasteCategory.getCategoryType());
        wasteRespostory.save(newWasteCate);
    }


}
