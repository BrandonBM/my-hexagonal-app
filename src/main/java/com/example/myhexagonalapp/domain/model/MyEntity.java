package com.example.myhexagonalapp.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MyEntity", schema = "schema")
public class MyEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data")
    private String data;

    public MyEntity() {
    }

    public MyEntity(Long id, String data) {
        this.id = id;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
