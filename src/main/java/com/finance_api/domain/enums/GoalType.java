package com.finance_api.domain.enums;

public enum GoalType {
    SPENDING_LIMIT("Limite de Gastos"),
    SAVINGS_TARGET("Meta de Economia");

    private final String label;

    GoalType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
