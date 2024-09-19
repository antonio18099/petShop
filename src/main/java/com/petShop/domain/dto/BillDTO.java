package com.petShop.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class BillDTO {
    private Integer id;
    private LocalDateTime date;
    private BigDecimal amount;
    private Integer ownerId;
    


}