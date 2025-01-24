package com.enviro.assessment.grad001.MosaMoime.Enviro.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("ENVIRO")
public class WasteCategory {

    @Id
    private int id;

    @NotEmpty(message = "Category must not be empty")
    @Size(max = 255, message = "Category must not exceed 255 characters")
    private String category;

    @NotEmpty(message = "Description must not be empty")
    @Size(max = 255, message = "Description must not exceed 255 characters")
    private String description;

    @Size(max = 255, message = "Category type must not exceed 255 characters")
    private String categoryType;




    public WasteCategory() {
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
