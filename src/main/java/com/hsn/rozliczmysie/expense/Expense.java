package com.hsn.rozliczmysie.expense;

import com.hsn.rozliczmysie.trip.Trip;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private LocalDate creationDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;
}
