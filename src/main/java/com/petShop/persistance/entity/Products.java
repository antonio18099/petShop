package com.petShop.persistance.entity;

import jakarta.persistence.*;
        import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "producto")
public class Products {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer productIds;

        @Column(name = "nombre")
        private String name;

        @Column(name = "categoria")
        private String category;

        @Column(name = "precio")
        private BigDecimal price;

        @Column(name = "stock")
        private Integer stock;

        @ManyToMany(mappedBy = "products")
        private List<Pet> pets;

        @ManyToMany
        @JoinTable(
                name = "producto_proveedor",
                joinColumns = @JoinColumn(name = "id_producto"),
                inverseJoinColumns = @JoinColumn(name = "id_proveedor")
        )
        private List<Suppliers> providers;

    public Object getId() {
        return null;
    }
}
