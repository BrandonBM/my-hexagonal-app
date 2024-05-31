package com.example.myhexagonalapp.infrastructure.adapter.in;

import com.example.myhexagonalapp.application.dto.MyDto;
import com.example.myhexagonalapp.application.port.in.MyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/myentity")
public class MyController {

    private final MyUseCase myUseCase;

    @Autowired
    public MyController(MyUseCase myUseCase) {
        this.myUseCase = myUseCase;
    }

    @PostMapping
    public void createEntity(@RequestBody MyDto myDto) {
        myUseCase.execute(myDto);
    }
}
