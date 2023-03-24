package dev.lisuk.strength.domain;

import java.util.OptionalInt;

public record Reps(
        int assignedReps,
        OptionalInt assignedRepsUpperBound,
        boolean assignedRepsIsOrMore,
        OptionalInt achievedReps

) {
}
