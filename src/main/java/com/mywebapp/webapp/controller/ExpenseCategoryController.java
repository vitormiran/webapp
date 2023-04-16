package com.mywebapp.webapp.controller;

import com.mywebapp.webapp.model.Content;
import com.mywebapp.webapp.model.ExpenseCategory;
import com.mywebapp.webapp.repository.ExpenseCategoryRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expensecategory")
@CrossOrigin
public class ExpenseCategoryController {

    private final ExpenseCategoryRepository repository;

    public ExpenseCategoryController(ExpenseCategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<ExpenseCategory> findAll() {
        return repository.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public void deleteExpenseCategory(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/add")
    public void addExpenseCategory(ExpenseCategory newItem) {
        repository.save(newItem);
    }
}
