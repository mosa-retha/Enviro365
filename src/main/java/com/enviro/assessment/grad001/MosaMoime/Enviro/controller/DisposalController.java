package com.enviro.assessment.grad001.MosaMoime.Enviro.controller;

import com.enviro.assessment.grad001.MosaMoime.Enviro.service.WasteCategory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disposal")
public class DisposalController implements IController {


    @Override
    public List<WasteCategory> getWasteCategories() {
        return List.of();
    }

    @Override
    public WasteCategory getWasteCategory(String id) {
        return null;
    }

    @Override
    public void deleteWasteCategory(String id) {

    }

    @Override
    public void addWasteCategory(WasteCategory wasteCategory) {

    }

    @Override
    public void updateWasteCategory(String id, WasteCategory wasteCategory) {

    }
}
