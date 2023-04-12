package com.mywebapp.webapp.repository;

import com.mywebapp.webapp.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ExpenseCategoryRepository extends ListCrudRepository<Content,Integer> {

}
