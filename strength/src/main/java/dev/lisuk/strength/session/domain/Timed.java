package dev.lisuk.strength.session.domain;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.OptionalInt;

public record Timed(
        @PositiveOrZero int assignedSeconds,
        OptionalInt assignedSecondsUpperBound,
        boolean assignedSecondsIsOrMore,
        OptionalInt achievedSeconds
) {
}
