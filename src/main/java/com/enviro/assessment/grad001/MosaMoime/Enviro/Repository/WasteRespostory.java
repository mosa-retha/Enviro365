package com.enviro.assessment.grad001.MosaMoime.Enviro.Repository;

import com.enviro.assessment.grad001.MosaMoime.Enviro.model.WasteCategory;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteRespostory extends CrudRepository<WasteCategory, Integer> {
}
