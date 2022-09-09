package com.mariia.restservice.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExerciseCommand {
    private String name;
    private String type;
    private int value;
}
