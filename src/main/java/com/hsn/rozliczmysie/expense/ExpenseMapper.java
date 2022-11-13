package com.hsn.rozliczmysie.expense;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {
    ExpenseDTO toDto(Expense expense);

    @Mapping(target = "id", ignore = true)
    Expense toEntity(ExpenseDTO expenseDTO);

    List<ExpenseDTO> toDto(List<Expense> expenses);
}
