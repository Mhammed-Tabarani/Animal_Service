package org.sid.Animalservice.repositories;

import org.sid.Animalservice.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface AnimalRepository extends JpaRepository<Animal,String> {
}
