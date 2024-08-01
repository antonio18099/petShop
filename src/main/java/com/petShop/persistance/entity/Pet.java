package com.petShop.persistance.entity;

import jakarta.persistence.*;
        import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "mascota")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "especie")
    private String species;

    @Column(name = "raza")
    private String breed;

    @ManyToOne
    @JoinColumn(name = "id_propietario", referencedColumnName = "id")
    private Owner owner;

    @ManyToMany
    @JoinTable(
            name = "mascota_producto",
            joinColumns = @JoinColumn(name = "id_mascota"),
            inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private List<Products> products;

    @OneToMany(mappedBy = "pet")
    private List<Quotes> quotes;
}
