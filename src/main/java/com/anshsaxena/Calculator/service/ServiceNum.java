package com.anshsaxena.Calculator.service;

import com.anshsaxena.Calculator.model.Result;
import com.anshsaxena.Calculator.repo.Numrepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.TreeSet;

@Service
public class ServiceNum {

    private Result result;
    private Numrepo numrepo;

    public Result evenservice(Result result) {
        return numrepo.checkAndAddDuplicate(result.getNumber());
    }
    public Result fiboservice(Result result) {
        return numrepo.checkAndAddDuplicate(result.getNumber());
    }

    public Result primeservice(Result result) {
        return numrepo.checkAndAddDuplicate(result.getNumber());
    }

    public Result randomservice(Result result) {
        return numrepo.checkAndAddDuplicate(result.getNumber());
    }


}
