package com.RestWeb.Rest.enums;

//This class indicates a project's status
public enum ProjectStatus {
    NOT_STARTED("NOT_STARTED"),
    ACTIVE("ACTIVE"),
    COMPLETED("COMPLETED");

    private final String name;

    ProjectStatus(String name) {
        this.name = name;
    }
}
