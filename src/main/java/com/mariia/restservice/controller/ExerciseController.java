package com.mariia.restservice.controller;

import com.mariia.restservice.dto.ExerciseCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class ExerciseController {
    private final Logger log = LoggerFactory.getLogger(this.getClass().getName());
    private final List<ExerciseCommand> exerciseCommandList = new ArrayList<>();

    @CrossOrigin
    @PostMapping("/exercise")
    public void addExercise(@RequestBody ExerciseCommand exerciseCommand) {
        log.info("Received exercise {}", exerciseCommand);
        exerciseCommandList.add(exerciseCommand);
    }

    @CrossOrigin
    @GetMapping("/exercise")
    public List<ExerciseCommand> getAll() {
        log.info("List {}", exerciseCommandList);
        return exerciseCommandList;
    }
}
