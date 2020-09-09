package com.github.payne.generator.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum AddOn {

    README("readme"),
    GUI_ASSETS("gui-assets"),
    GRADLE_WRAPPER("gradle-wrapper");
    private final String value;
    private static final Map<String, AddOn> CONSTANTS = new HashMap<>();

    static {
        for (AddOn c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AddOn(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AddOn fromValue(String value) {
        AddOn constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}