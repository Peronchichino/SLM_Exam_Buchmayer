package com.example.slm_exam_buchmayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuadratController {

    @GetMapping("/api/quadrat")
    public int quadrat(int x){
        return x*x;
    }
}
