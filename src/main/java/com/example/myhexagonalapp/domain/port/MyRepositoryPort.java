package com.example.myhexagonalapp.domain.port;

import com.example.myhexagonalapp.domain.model.MyEntity;

public interface MyRepositoryPort {

    MyEntity save(MyEntity myEntity);
    MyEntity findById(Long id);

}
