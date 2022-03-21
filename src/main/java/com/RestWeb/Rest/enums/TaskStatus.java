package com.RestWeb.Rest.enums;

public enum TaskStatus {
    TO_DO("TO_DO"),
    IN_PROGRESS("IN_PROGRESS"),
    DONE("DONE");

    private final String name;

    TaskStatus(String name) {
        this.name = name;
    }

}
