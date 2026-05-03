package com.finance_api.domain.enums;

public enum RecurrenceType {
    DAILY("Diário"),
    WEEKLY("Semanal"),
    MONTHLY("Mensal"),
    YEARLY("Anual");

    private final String label;

    RecurrenceType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
