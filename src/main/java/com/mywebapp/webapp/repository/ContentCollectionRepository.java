package com.mywebapp.webapp.repository;

import com.mywebapp.webapp.model.Content;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }

    public boolean existById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count()==1;
    }

    @PostConstruct
    private void init() {
        Content newContent = new Content(null,
                "my first desc", "my very first blog post", "IDEA", "ARTICLE", LocalDateTime.now(),null,"");
        contentList.add(newContent);
    }

}
