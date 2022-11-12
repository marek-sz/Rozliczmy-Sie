package com.hsn.rozliczmysie.expense;

import com.hsn.rozliczmysie.trip.TripRepository;
import com.hsn.rozliczmysie.trip.Trip;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseMapper expenseMapper;
    private final ExpenseRepository expenseRepository;
    private final TripRepository tripRepository;

    public void create(final Long tripId, final ExpenseDTO expenseDTO) {
        final Trip trip = tripRepository.findById(tripId).orElseThrow();
        Expense expense = expenseMapper.toEntity(expenseDTO);
        expense.setTrip(trip);
        expenseRepository.save(expense);
    }
}
