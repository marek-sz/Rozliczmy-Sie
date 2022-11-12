package com.hsn.rozliczmysie.expense;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ExpenseDTO {
    @NonNull
    private BigDecimal amount;
    private LocalDate creationDate;
    private String description;
}
