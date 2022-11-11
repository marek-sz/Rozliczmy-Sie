package com.hsn.rozliczmysie;

import com.hsn.rozliczmysie.dto.ExpenseDTO;
import com.hsn.rozliczmysie.model.Expense;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {
    ExpenseDTO toDto(Expense expense);
}
