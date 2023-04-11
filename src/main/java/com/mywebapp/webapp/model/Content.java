package com.mywebapp.webapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;

@Entity
public class Content {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        Integer id;
        @NotBlank
        String title;
        String descr;
        String status;
        String contentType;
        LocalDateTime dateCreated;
        LocalDateTime dateUpdated;
        String url;

        public Content( ) {

        }
        public Content(Integer id, String title, String descr, String status, String contentType, LocalDateTime dateCreated, LocalDateTime dateUpdated, String url) {
                this.id = id;
                this.title = title;
                this.descr = descr;
                this.status = status;
                this.contentType = contentType;
                this.dateCreated = dateCreated;
                this.dateUpdated = dateUpdated;
                this.url = url;
        }

        public Integer id() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getDescr() {
                return descr;
        }

        public void setDescr(String descr) {
                this.descr = descr;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public String getContentType() {
                return contentType;
        }

        public void setContentType(String contentType) {
                this.contentType = contentType;
        }

        public LocalDateTime getDateCreated() {
                return dateCreated;
        }

        public void setDateCreated(LocalDateTime dateCreated) {
                this.dateCreated = dateCreated;
        }

        public LocalDateTime getDateUpdated() {
                return dateUpdated;
        }

        public void setDateUpdated(LocalDateTime dateUpdated) {
                this.dateUpdated = dateUpdated;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }
}
