package com.anshsaxena.Calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.Session;
import org.springframework.aop.aspectj.annotation.PrototypeAspectInstanceFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.TreeSet;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    ArrayList<Integer> number=new ArrayList<>();
    ArrayList<Integer> windowPrevState = new ArrayList<>();
    TreeSet<Integer> windowCurrState = new TreeSet<>();
    Double avg;
}

