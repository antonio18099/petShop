package com.petShop.domain.dto;

import lombok.Data;

import java.util.List;
@Data
public class SuppliersDTO {
    private Integer id;
    private String name;
    private String contact;
    private String phone;
    private String address;
    private List<Integer> productIds; // Lista de IDs de productos

}