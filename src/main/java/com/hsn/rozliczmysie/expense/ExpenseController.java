package com.hsn.rozliczmysie.expense;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping("api/expenses")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestParam @NonNull Long tripId, @RequestBody @NonNull ExpenseDTO expenseDTO) {
        expenseService.create(tripId, expenseDTO);
    }

    @GetMapping("api/expenses/{expenseId}")
    @ResponseStatus(HttpStatus.OK)
    public ExpenseDTO get(@PathVariable Long expenseId) {
        return expenseService.getById(expenseId);
    }
}
