package com.hsn.rozliczmysie.expense;

import com.hsn.rozliczmysie.share.Share;
import com.hsn.rozliczmysie.trip.Trip;
import com.hsn.rozliczmysie.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "expense_owner_id")
    private User expenseOwner;

    @OneToMany(mappedBy = "expense", cascade = CascadeType.ALL)
    private List<Share> shares;
}
