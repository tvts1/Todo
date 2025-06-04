package com.app.todo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TodoDTO(
        Long id,

        @NotBlank(message= "Title is mandatory")
        String title,

        String description,

        @NotNull(message = "Completed must be specified")
        Boolean completed
) {}
