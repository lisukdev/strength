package dev.lisuk.strength.domain;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;

public record ExerciseSet(
        UUID id,
        Optional<Reps> reps,
        Optional<Timed> timed,
        Optional<Load> load,
        OptionalInt restSeconds
) {
}
