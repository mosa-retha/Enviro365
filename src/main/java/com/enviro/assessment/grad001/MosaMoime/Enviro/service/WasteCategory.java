package com.enviro.assessment.grad001.MosaMoime.Enviro.service;

import org.springframework.stereotype.Service;

@Service
public class WasteCategory {

    private String id;
    private String category;
    private String description;

    public WasteCategory() {
    }

    public WasteCategory(String id, String category, String description) {
        this.id = id;
        this.category = category;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
