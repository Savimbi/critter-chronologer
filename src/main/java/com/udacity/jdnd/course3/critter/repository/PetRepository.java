package com.udacity.jdnd.course3.critter.repository;

import com.udacity.jdnd.course3.critter.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet,Long> {
    @Query("SELECT p FROM Pet p JOIN p.customer c WHERE c.id = :ownerId")
    List<Pet> findPetsByOwner(@Param("ownerId") Long ownerId);

}
