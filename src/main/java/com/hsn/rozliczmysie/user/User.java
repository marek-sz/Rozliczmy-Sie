package com.hsn.rozliczmysie.user;


import com.hsn.rozliczmysie.expense.Expense;
import com.hsn.rozliczmysie.trip.Trip;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany
    private List<Trip> trips;

    @OneToMany
    private List<Expense> expenses;
}
