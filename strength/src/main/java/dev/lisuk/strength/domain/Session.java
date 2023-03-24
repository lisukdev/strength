package dev.lisuk.strength.domain;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record Session(
        UUID id,
        @NotEmpty String title,
        @NotEmpty List<Block> blocks
) {
}
