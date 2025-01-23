package com.enviro.assessment.grad001.MosaMoime.Enviro.model;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("Enviro")
public class WasteCategory {
    @Id
    private int id;

    @NotEmpty
    private String category;
    @NotEmpty
    private String description;
    @NotEmpty
    private String categoryType;



    public WasteCategory() {
    }

    public WasteCategory(int id, String category, String description, String categoryType) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.categoryType = categoryType;
    }


    public WasteCategory (String category, String description, String categoryType){
        this.category = category;
        this.description = description;
        this.categoryType = categoryType;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }
}
