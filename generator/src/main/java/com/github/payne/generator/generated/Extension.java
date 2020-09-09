package com.github.payne.generator.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum Extension {

    ASHLEY("ashley"),
    BOX_2_D_LIGHTS("box2d-lights"),
    AI("ai"),
    BOX_2_D("box2d"),
    BULLET("bullet"),
    CONTROLLERS("controllers"),
    FREETYPE("freetype"),
    TOOLS("tools");
    private final String value;
    private static final Map<String, Extension> CONSTANTS = new HashMap<>();

    static {
        for (Extension c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Extension(String value) {
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
    public static Extension fromValue(String value) {
        Extension constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}