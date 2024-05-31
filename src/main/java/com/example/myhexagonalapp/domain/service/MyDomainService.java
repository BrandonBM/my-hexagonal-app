package com.example.myhexagonalapp.domain.service;

import com.example.myhexagonalapp.domain.model.MyEntity;
import com.example.myhexagonalapp.domain.port.MyRepositoryPort;
import com.example.myhexagonalapp.infrastructure.adapter.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyDomainService {

    private final MyRepositoryPort myRepository;

    public MyDomainService(MyRepositoryPort myRepository) {
        this.myRepository = myRepository;
    }

    public void processData(String data) {
        MyEntity myEntity = new MyEntity();
        myEntity.setData(data);
        myRepository.save(myEntity);
    }
}
