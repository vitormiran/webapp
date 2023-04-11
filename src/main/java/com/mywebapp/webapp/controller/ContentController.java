package com.mywebapp.webapp.controller;

import com.mywebapp.webapp.model.Content;
import com.mywebapp.webapp.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {

    //private final ContentCollectionRepository repository;
    //private final ContentJdbcTemplateRepository repository;
    private final ContentRepository repository;
    public ContentController(ContentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Content> findById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Integer create(@Valid @RequestBody Content content) {
        repository.save(content);
        return content.id();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        } else {
            repository.save(content);
        }

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/filter/{keyword}")
    public List<Content> findByTitle(@PathVariable String keyword) {
        return repository.findAllByTitleContains(keyword);
    }

    @GetMapping("/filter/status/{status}")
    public List<Content> filterByStatus(@PathVariable String status) {
        return repository.listByStatus(status);
    }
}
