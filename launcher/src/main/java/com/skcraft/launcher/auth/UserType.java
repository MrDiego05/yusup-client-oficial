package com.skcraft.launcher.auth;

public enum UserType {
    MICROSOFT("msa");

    private final String id;

    UserType(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
