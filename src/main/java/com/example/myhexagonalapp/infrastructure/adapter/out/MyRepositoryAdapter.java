package com.example.myhexagonalapp.infrastructure.adapter.out;

import com.example.myhexagonalapp.domain.model.MyEntity;
import com.example.myhexagonalapp.domain.repository.MyRepository;
import org.springframework.stereotype.Component;

@Component
public class MyRepositoryAdapter implements MyRepository {

    // Aquí se puede inyectar un JpaRepository u otra forma de acceso a datos

    @Override
    public MyEntity save(MyEntity myEntity) {
        // Lógica de persistencia
        return myEntity;
    }

    @Override
    public MyEntity findById(Long id) {
        // Lógica de búsqueda
        return new MyEntity();
    }
}
