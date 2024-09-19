package com.petShop.persistance.entity;

import jakarta.persistence.*;
        import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "proveedor")
public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "contacto")
    private String contact;

    @Column(name = "telefono")
    private String phone;

    @Column(name = "direccion")
    private String address;

    @ManyToMany(mappedBy = "providers")
    private List<Products> productsIds;

    @OneToMany(mappedBy = "provider")
    private List<Quotes> quotes;
}
