package com.petShop.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class ProductsDTO {
    private Integer id;
    private String name;
    private String category;
    private BigDecimal price;
    private Integer stock;
    private List<Integer> petIds; // Lista de IDs de mascotas
    private List<Integer> providerIds; // Lista de IDs de proveedores


}