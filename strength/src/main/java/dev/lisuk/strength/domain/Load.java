package dev.lisuk.strength.domain;

import jakarta.validation.constraints.NotNull;

import java.util.Optional;
import java.util.OptionalDouble;

public record Load(
        @NotNull Scheme scheme,
        OptionalDouble assignedLoadNumeric,
        Optional<Weight> assignedLoadWeight,
        Optional<Weight> achievedWeight
) {
    public enum Scheme {
        RPE, PERCENTAGE, WEIGHT
    }
}
