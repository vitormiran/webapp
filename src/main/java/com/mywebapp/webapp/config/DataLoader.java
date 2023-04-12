package com.mywebapp.webapp.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mywebapp.webapp.model.Content;
import com.mywebapp.webapp.model.ExpenseCategory;
import com.mywebapp.webapp.repository.ContentRepository;
import com.mywebapp.webapp.repository.ExpenseCategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Profile("!dev")
@Component
public class DataLoader implements CommandLineRunner {

    private final ContentRepository repository;
    private final ObjectMapper objectMapper;

    private final ExpenseCategoryRepository expenseCategoryRepository;

    public DataLoader(ContentRepository repository, ObjectMapper objectMapper, ExpenseCategoryRepository expenseCategoryRepository) {
        this.repository = repository;
        this.objectMapper=objectMapper;
        this.expenseCategoryRepository = expenseCategoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        try (InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")) {
            repository.saveAll(objectMapper.readValue(inputStream,new TypeReference<List<Content>>(){}));
            System.out.println("Records inserted");
            //expenseCategoryRepository.save(<ExpenseCategory>new ExpenseCategory());
        }
    }
}
