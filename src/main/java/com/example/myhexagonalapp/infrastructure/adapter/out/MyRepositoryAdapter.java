package com.example.myhexagonalapp.infrastructure.adapter.out;

import com.example.myhexagonalapp.domain.model.MyEntity;
import com.example.myhexagonalapp.domain.port.MyRepositoryPort;
import com.example.myhexagonalapp.infrastructure.adapter.repository.MyRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MyRepositoryAdapter implements MyRepositoryPort {


    private final MyRepository myRepository;

    public MyRepositoryAdapter(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Override
    public MyEntity save(MyEntity myEntity) {
        return myRepository.save(myEntity);
    }

    @Override
    public MyEntity findById(Long id) {
        return myRepository.findById(id).orElse(null);
    }

    // Aquí se puede inyectar un JpaRepository u otra forma de acceso a datos


}
