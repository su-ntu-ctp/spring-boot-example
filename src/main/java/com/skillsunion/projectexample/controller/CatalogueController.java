package com.skillsunion.projectexample.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.skillsunion.projectexample.entity.Catalogue;
import com.skillsunion.projectexample.service.CatalogueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/catalogues")
public class CatalogueController {

    @Autowired CatalogueService service;
    
    @GetMapping
    public @ResponseBody List<Catalogue> list(){
        return service.list();
    }

    @GetMapping("/{id}")
    public @ResponseBody Catalogue get(@PathVariable int id){
        try{
            return service.get(id);
        }catch(NoSuchElementException e){
            // This error is thrown by service when element with the given id is not found.
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }catch(Exception e){
            // When any other errors thrown...
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Catalogue> create(@RequestBody Catalogue catalogue){
        Catalogue created = service.create(catalogue);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }
}
