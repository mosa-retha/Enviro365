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


    public Iterable<WasteCategory> getWasteServiceCategories(String categoryType){
        List<WasteCategory> filteredCategories = new ArrayList<>();
        for (WasteCategory wasteCategory : wasteRespostory.findAll()) {
            if (wasteCategory.getCategoryType().equalsIgnoreCase(categoryType)) {
                filteredCategories.add(wasteCategory);
            }
        }
        return filteredCategories;
    }

    public WasteCategory getWasteServiceCategory(Integer id, String categoryType){
        WasteCategory wasteCategory = wasteRespostory.findById(id).orElse(null);
        assert wasteCategory != null;
        if (wasteCategory.getCategoryType().equalsIgnoreCase(categoryType) && wasteCategory.getId() == id) {
            return wasteCategory;
        }
        return null;
    }

    public void addWasteServiceCategory(WasteCategory wasteCategory){
        wasteRespostory.save(wasteCategory);
    }

    public void deleteWasteServiceCategory(Integer id, String categoryType){
        if (wasteRespostory.findById(id).orElse(null).getCategoryType().equalsIgnoreCase(categoryType)) {
            wasteRespostory.deleteById(id);
        }
    }

    public void updateWasteServiceCategory(Integer id, WasteCategory wasteCategory){
        WasteCategory newWasteCate = wasteRespostory.findById(id).orElseThrow(IndexOutOfBoundsException::new);
        newWasteCate.setCategory(wasteCategory.getCategory());
        newWasteCate.setDescription(wasteCategory.getDescription());
        newWasteCate.setCategoryType(wasteCategory.getCategoryType());
        wasteRespostory.save(newWasteCate);
    }


}
