package com.example.expense_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense_tracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
// done