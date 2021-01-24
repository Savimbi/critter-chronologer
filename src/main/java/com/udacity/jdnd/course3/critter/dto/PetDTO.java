package com.udacity.jdnd.course3.critter.dto;

import com.udacity.jdnd.course3.critter.entity.PetType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Represents the form that pet request and response data takes. Does not map
 * to the database directly.
 */
@Data
public class PetDTO {
    private Long id;
    private PetType type;
    private String name;
    private Long ownerId;
    private LocalDate birthDate;
    private String notes;


}
