package com.hsn.rozliczmysie.dto;

import com.hsn.rozliczmysie.model.Expense;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TripDTO {

    private Long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Expense> expenses = new ArrayList<>();

}
