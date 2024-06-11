package com.example.myhexagonalapp.application.port.in;

import com.example.myhexagonalapp.application.dto.MyDto;

public interface MyUseCasePort {
    void execute(MyDto myDto);
}
