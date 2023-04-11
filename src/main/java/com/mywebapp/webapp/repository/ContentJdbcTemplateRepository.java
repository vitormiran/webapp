package com.mywebapp.webapp.repository;

import com.mywebapp.webapp.model.Content;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class ContentJdbcTemplateRepository {

    private final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate template) {
        jdbcTemplate =template;
    }

    private static Content mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Content(rs.getInt("id"),
                rs.getString("title"),
                rs.getString("descr"),
                rs.getString("status"),
                rs.getString("content_type"),
                rs.getObject("date_created", LocalDateTime.class),
                rs.getObject("date_updated", LocalDateTime.class),
                rs.getString("url"));
    }

    public List<Content> getAllContent() {
        String sql = "select * from Content";
        List<Content> contents = jdbcTemplate.query(sql, ContentJdbcTemplateRepository::mapRow);
        return contents;
    }

    public Content findById(Integer id) {
        String sql = "select * from Content where id=?";
        Content content = jdbcTemplate.queryForObject(sql, ContentJdbcTemplateRepository::mapRow, id);
        return content;
    }

}
