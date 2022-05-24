package com.skillsunion.projectexample.service;

import java.util.List;

import com.skillsunion.projectexample.entity.Catalogue;
import com.skillsunion.projectexample.repository.CatalogueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogueService {

    @Autowired CatalogueRepository catalogueRepo;

    public List<Catalogue> list(){
        return (List<Catalogue>)catalogueRepo.findAll();
    }

    public Catalogue create(Catalogue catalogue){
        return catalogueRepo.save(catalogue);
    }
    
}
