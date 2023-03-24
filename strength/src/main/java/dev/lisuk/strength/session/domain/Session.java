package dev.lisuk.strength.session.domain;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record Session(
        UUID id,
        @NotEmpty String title,
        LocalDate date,
        @NotEmpty List<Block> blocks
) {
}
