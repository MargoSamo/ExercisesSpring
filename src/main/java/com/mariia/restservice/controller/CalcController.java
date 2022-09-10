package com.mariia.restservice.controller;

import com.mariia.restservice.dto.CalcCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/")
public class CalcController {
    private final Logger log = LoggerFactory.getLogger(this.getClass().getName());
    int result = 0;

    @CrossOrigin
    @PostMapping("/calc")
    public void addNumber(@RequestBody CalcCommand calcCommand) {
        log.info("Received exercise {}", calcCommand);
        result += calcCommand.getValue();
    }

    @CrossOrigin
    @GetMapping("/calc")
    public Integer getNumber() {
        log.info("List {}", result);
        int sum = 0;
        sum += result;
        return sum;
    }
}