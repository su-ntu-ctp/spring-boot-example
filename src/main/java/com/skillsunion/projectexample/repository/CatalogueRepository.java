package com.skillsunion.projectexample.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
import com.skillsunion.projectexample.entity.Catalogue;

@Repository
public interface CatalogueRepository extends CrudRepository<Catalogue, Integer>{


}
