package dev.lisuk.strength.session.domain;

import java.util.OptionalInt;

public record Reps(
        int assignedReps,
        OptionalInt assignedRepsUpperBound,
        boolean assignedRepsIsOrMore,
        OptionalInt achievedReps

) {
}
