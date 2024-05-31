package com.example.myhexagonalapp.domain.repository;

import com.example.myhexagonalapp.domain.model.MyEntity;

public interface MyRepository {
    MyEntity save(MyEntity myEntity);
    MyEntity findById(Long id);
}
