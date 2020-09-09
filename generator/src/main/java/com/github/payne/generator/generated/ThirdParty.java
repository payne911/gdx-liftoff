package com.github.payne.generator.generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "library",
        "version"
})
public class ThirdParty implements Serializable
{

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("library")
    private String library;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("version")
    private String version;
    private final static long serialVersionUID = -5771173252731252962L;

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("library")
    public String getLibrary() {
        return library;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("library")
    public void setLibrary(String library) {
        this.library = library;
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

}