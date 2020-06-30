package com.example.demo.controller;

import com.example.demo.entity.People;
import com.example.demo.repo.TestSpecRepository;
import com.example.demo.spec.TestSpecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestRestController {
    @Autowired
    TestSpecRepository testSpecRepository;

    @GetMapping("/test-spec")
    public List<People> testSpec(){
        List<People> result = testSpecRepository.findAll(Specification.where(TestSpecs.testSpec2()));
        return result;
    }

    @GetMapping("/test-spec-query")
    public List<People> testSpecQuery(){
        List<People> result = testSpecRepository.testJoin();
        return result;
    }
}
