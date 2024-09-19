package com.petShop.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class QuotesDTO {
    private Integer id;
    private String description;
    private LocalDateTime date;
    private Integer petId; // Representa el ID de la mascota


}