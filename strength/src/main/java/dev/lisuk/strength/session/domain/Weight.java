package dev.lisuk.strength.session.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record Weight(@Positive double amount, @NotNull Weight.Unit unit) {
    private static final double POUND_PER_KG = 2.20462262;

    public enum Unit {
        KG, LB
    }
    public Weight getKg() {
        if (unit == Unit.LB) {
            return new Weight(amount / POUND_PER_KG, Unit.KG);
        }
        return this;
    }

    public Weight getLb() {
        if (unit == Unit.KG) {
            return new Weight(amount * POUND_PER_KG, Unit.LB);
        }
        return this;
    }
}
