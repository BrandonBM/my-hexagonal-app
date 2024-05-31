package com.example.myhexagonalapp.application.service;

import com.example.myhexagonalapp.application.port.in.MyUseCase;
import com.example.myhexagonalapp.application.dto.MyDto;
import com.example.myhexagonalapp.domain.service.MyDomainService;
import org.springframework.stereotype.Service;

@Service
public class MyService implements MyUseCase {

    private final MyDomainService myDomainService;

    public MyService(MyDomainService myDomainService) {
        this.myDomainService = myDomainService;
    }

    @Override
    public void execute(MyDto myDto) {
        myDomainService.processData(myDto.getData());
    }
}
