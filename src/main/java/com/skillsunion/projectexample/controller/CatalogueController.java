package com.skillsunion.projectexample.controller;

import java.util.List;

import com.skillsunion.projectexample.entity.Catalogue;
import com.skillsunion.projectexample.service.CatalogueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogues")
public class CatalogueController {

    @Autowired CatalogueService service;
    
    @GetMapping
    public @ResponseBody List<Catalogue> list(){

        return service.list();
    }

    @PostMapping
    public ResponseEntity<Catalogue> create(@RequestBody Catalogue catalogue){
        Catalogue created = service.create(catalogue);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }
}
