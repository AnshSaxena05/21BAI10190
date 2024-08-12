package com.anshsaxena.Calculator.controller;

import com.anshsaxena.Calculator.CalculatorApplication;
import com.anshsaxena.Calculator.model.Result;
import com.anshsaxena.Calculator.service.ServiceNum;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/numbers")
public class calController {

    private ServiceNum serviceNum;

    @GetMapping("/e")
    public ResponseEntity<Result> addevennums(@RequestAttribute Result result){

        return ResponseEntity.ok(serviceNum.evenservice(result));
    }
    @GetMapping("/f")
    public ResponseEntity<Result> addfibonum(@RequestAttribute Result result){
        return ResponseEntity.ok(serviceNum.fiboservice(result));
    }
    @GetMapping("/p")
    public  ResponseEntity<Result> addprime(@RequestAttribute Result result){
        return ResponseEntity.ok(serviceNum.primeservice(result));
    }
    @GetMapping("/r")
    public ResponseEntity<Result> addrandom(@RequestAttribute Result result){
        return ResponseEntity.ok(serviceNum.randomservice(result));
    }

}
