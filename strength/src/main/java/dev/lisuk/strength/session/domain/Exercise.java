package dev.lisuk.strength.session.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

public record Exercise(
        @NotNull UUID id,
        @NotEmpty String name,
        @NotEmpty List<ExerciseSet> sets
) {
}
