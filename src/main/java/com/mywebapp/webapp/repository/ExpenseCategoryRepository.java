package com.mywebapp.webapp.repository;

import com.mywebapp.webapp.model.Content;
import com.mywebapp.webapp.model.ExpenseCategory;
import org.springframework.data.repository.ListCrudRepository;

public interface ExpenseCategoryRepository extends ListCrudRepository<ExpenseCategory,Integer> {

}
