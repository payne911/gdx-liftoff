package com.github.payne.generator.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "language",
        "version"
})
public class Languages implements Serializable
{

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("language")
    private Language language;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("version")
    private String version;
    private final static long serialVersionUID = 572919171789395068L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Languages() {
    }

    /**
     *
     * @param language
     * @param version
     */
    public Languages(Language language, String version) {
        super();
        this.language = language;
        this.version = version;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("language")
    public Language getLanguage() {
        return language;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public enum Language {

        SCALA("scala"),
        KOTLIN("kotlin"),
        GROOVY("groovy");
        private final String value;
        private final static Map<String, Language> CONSTANTS = new HashMap<String, Language>();

        static {
            for (Language c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Language(String value) {
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
        public static Language fromValue(String value) {
            Language constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}