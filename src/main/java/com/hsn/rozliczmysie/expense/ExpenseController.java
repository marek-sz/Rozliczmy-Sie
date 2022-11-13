package com.hsn.rozliczmysie.expense;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping("api/trips/{tripId}/expenses")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@PathVariable Long tripId, @RequestBody @NonNull ExpenseDTO expenseDTO) {
        expenseService.create(tripId, expenseDTO);
    }

    @GetMapping("api/trips/{tripId}/expenses/{expenseId}")
    @ResponseStatus(HttpStatus.OK)
    public ExpenseDTO get(@PathVariable Long tripId, @PathVariable Long expenseId) {
        return expenseService.getById(expenseId);
    }

    @GetMapping("api/trips/{tripId}/expenses")
    @ResponseStatus(HttpStatus.OK)
    public List<ExpenseDTO> getExpenses(@PathVariable @NonNull Long tripId) {
        return expenseService.getExpenses(tripId);
    }
}
