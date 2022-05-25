package com.skillsunion.projectexample.service;

import java.util.List;
import java.util.Optional;

import com.skillsunion.projectexample.entity.Catalogue;
import com.skillsunion.projectexample.repository.CatalogueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogueService {

    @Autowired CatalogueRepository repo;

    public List<Catalogue> list(){
        return (List<Catalogue>)repo.findAll();
    }

    public Catalogue create(Catalogue catalogue){
        return repo.save(catalogue);
    }

    public Catalogue get(int id){
        Optional<Catalogue> found = repo.findById(id);
        return found.get();
    }
    
}
