package com.hsn.rozliczmysie.trip;

import com.hsn.rozliczmysie.expense.ExpenseDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TripDTO {

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<ExpenseDTO> expenses = new ArrayList<>();

}
