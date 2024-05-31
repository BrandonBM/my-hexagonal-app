package com.example.myhexagonalapp.domain.service;

import com.example.myhexagonalapp.domain.model.MyEntity;
import com.example.myhexagonalapp.domain.repository.MyRepository;
import org.springframework.stereotype.Service;

@Service
public class MyDomainService {

    private final MyRepository myRepository;

    public MyDomainService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void processData(String data) {
        MyEntity myEntity = new MyEntity();
        myEntity.setData(data);
        myRepository.save(myEntity);
    }
}
