package com.hsn.rozliczmysie.expense;

import com.hsn.rozliczmysie.share.ShareDTO;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ExpenseDTO {
    @NonNull
    private BigDecimal amount;
    private LocalDate creationDate;
    private String description;

    private List<ShareDTO> shares = new ArrayList<>();
}
