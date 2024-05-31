package com.example.myhexagonalapp.infrastructure.adapter.repository;

import com.example.myhexagonalapp.domain.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<MyEntity, Long> {

}
