package com.hsn.rozliczmysie.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ExpenseDTO {
    private BigDecimal amount;
    private LocalDate creationDate;
    private String description;
}
