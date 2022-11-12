package com.hsn.rozliczmysie.expense;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {
    ExpenseDTO toDto(Expense expense);

    @Mapping(target = "id", ignore = true)
    Expense toEntity(ExpenseDTO expenseDTO);
}
