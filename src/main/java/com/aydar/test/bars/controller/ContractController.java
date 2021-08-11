package com.aydar.test.bars.controller;

import com.aydar.test.bars.entity.Contract;
import com.aydar.test.bars.repository.ContractRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/rest/contract", produces = "application/json")
public class ContractController {

    private final ContractRepository repository;

    public ContractController(ContractRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Contract>> all() {
        List<Contract> contracts = new ArrayList<>(repository.findAll());
        return ResponseEntity.ok(contracts);
    }
}
