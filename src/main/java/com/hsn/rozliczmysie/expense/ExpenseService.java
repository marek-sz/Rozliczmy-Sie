package com.hsn.rozliczmysie.expense;

import com.hsn.rozliczmysie.trip.TripRepository;
import com.hsn.rozliczmysie.trip.Trip;
import com.hsn.rozliczmysie.user.User;
import com.hsn.rozliczmysie.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseMapper expenseMapper;
    private final ExpenseRepository expenseRepository;
    private final TripRepository tripRepository;
    private final UserRepository userRepository;

    public void create(final Long tripId, final Long userId, final ExpenseDTO expenseDTO) {
        final Trip trip = tripRepository.findById(tripId).orElseThrow();
        final User user = userRepository.findById(userId).orElseThrow();
        Expense expense = expenseMapper.toEntity(expenseDTO);
        expense.setTrip(trip);
        expense.setExpenseOwner(user);
        expenseRepository.save(expense);
    }

    public ExpenseDTO getById(final Long expenseId) {
        final Expense expense = expenseRepository.findById(expenseId).orElseThrow();
        return expenseMapper.toDto(expense);
    }

    public List<ExpenseDTO> getExpenses(final Long tripId) {
        final List<Expense> expenses = expenseRepository.findByTripId(tripId);
        return expenseMapper.toDto(expenses);
    }
}
