package com.mywebapp.webapp.repository;

import com.mywebapp.webapp.model.Content;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query(value = "SELECT * FROM Content where status=:status", nativeQuery = true)
    List<Content> listByStatus(@Param("status") String status);
}

