package com.enviro.assessment.grad001.MosaMoime.Enviro.service;

import com.enviro.assessment.grad001.MosaMoime.Enviro.model.WasteCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WasteService {
    // placeholder for the database
    private ArrayList<WasteCategory> db = new ArrayList<>();

    public WasteService(){
        db.add(new WasteCategory(1, "Plastic", "Plastic waste", "Waste"));
        db.add(new WasteCategory(2, "Paper", "Paper waste", "Waste"));
        db.add(new WasteCategory(3, "Glass", "Glass waste", "Waste"));
        db.add(new WasteCategory(4, "Metal", "Metal waste", "Waste"));
        db.add(new WasteCategory(5, "Organic", "Organic waste", "Disposal"));
        db.add(new WasteCategory(6, "E-waste", "Electronic waste", "Disposal"));
    }


    public List<WasteCategory> getWasteServiceCategories(){
        return db;
    }

    public WasteCategory getWasteServiceCategory(int id){
        return db.get(id);
    }

    public void addWasteServiceCategory(WasteCategory wasteCategory){
        wasteCategory.setId(db.size() + 1);
        db.add(wasteCategory);
    }

    public void deleteWasteServiceCategory(int id){
        db.remove(id);
    }

    public void updateWasteServiceCategory(int id, WasteCategory wasteCategory){
        db.set(id, wasteCategory);
    }


}
