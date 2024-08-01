package com.petShop.persistance.entity;

import jakarta.persistence.*;
        import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "factura")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "fecha")
    private LocalDateTime date;

    @Column(name = "monto")
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "id_propietario", referencedColumnName = "id")
    private Owner owner;
}
