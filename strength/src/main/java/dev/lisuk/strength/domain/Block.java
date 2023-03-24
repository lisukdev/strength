package dev.lisuk.strength.domain;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;
import java.util.Optional;

public record Block(
        boolean isSuperset,
        Optional<String> title,
        @NotEmpty List<Exercise> exercises
) {
}
