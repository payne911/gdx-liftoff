package com.github.payne.generator.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        "liftoff-json-version",
        "basic",
        "platforms",
        "languages",
        "extensions",
        "third-party",
        "versions",
        "add-ons",
        "template",
        "post-generation-gradle-task-command"
})
public class GeneratorDto implements Serializable
{

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("liftoff-json-version")
    private Double liftoffJsonVersion;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("basic")
    private Basic basic;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("platforms")
    private List<Platform> platforms = new ArrayList<>();
    @JsonProperty("languages")
    private List<Languages> languages = new ArrayList<>();
    @JsonProperty("extensions")
    private List<Extension> extensions = new ArrayList<>();
    @JsonProperty("third-party")
    private List<ThirdParty> thirdParty = new ArrayList<>();
    @JsonProperty("versions")
    private Versions versions;
    @JsonProperty("add-ons")
    private List<AddOn> addOns = new ArrayList<>();
    @JsonProperty("template")
    private GeneratorDto.Template template;
    @JsonProperty("post-generation-gradle-task-command")
    private String postGenerationGradleTaskCommand;
    private static final long serialVersionUID = 4853196008779219351L;


    /**
     *
     * (Required)
     *
     */
    @JsonProperty("liftoff-json-version")
    public Double getLiftoffJsonVersion() {
        return liftoffJsonVersion;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("liftoff-json-version")
    public void setLiftoffJsonVersion(Double liftoffJsonVersion) {
        this.liftoffJsonVersion = liftoffJsonVersion;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("basic")
    public Basic getBasic() {
        return basic;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("basic")
    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("platforms")
    public List<Platform> getPlatforms() {
        return platforms;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("platforms")
    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    @JsonProperty("languages")
    public List<Languages> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    @JsonProperty("extensions")
    public List<Extension> getExtensions() {
        return extensions;
    }

    @JsonProperty("extensions")
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    @JsonProperty("third-party")
    public List<ThirdParty> getThirdParty() {
        return thirdParty;
    }

    @JsonProperty("third-party")
    public void setThirdParty(List<ThirdParty> thirdParty) {
        this.thirdParty = thirdParty;
    }

    @JsonProperty("versions")
    public Versions getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(Versions versions) {
        this.versions = versions;
    }

    @JsonProperty("add-ons")
    public List<AddOn> getAddOns() {
        return addOns;
    }

    @JsonProperty("add-ons")
    public void setAddOns(List<AddOn> addOns) {
        this.addOns = addOns;
    }

    @JsonProperty("template")
    public GeneratorDto.Template getTemplate() {
        return template;
    }

    @JsonProperty("template")
    public void setTemplate(GeneratorDto.Template template) {
        this.template = template;
    }

    @JsonProperty("post-generation-gradle-task-command")
    public String getPostGenerationGradleTaskCommand() {
        return postGenerationGradleTaskCommand;
    }

    @JsonProperty("post-generation-gradle-task-command")
    public void setPostGenerationGradleTaskCommand(String postGenerationGradleTaskCommand) {
        this.postGenerationGradleTaskCommand = postGenerationGradleTaskCommand;
    }

    public enum Template {

        APPLICATION_ADAPTER("application-adapter"),
        APPLICATION_LISTENER("application-listener"),
        CLASSIC("classic"),
        EMPTY("empty"),
        GAME("game"),
        INPUT_PROCESSOR("input-processor"),
        SCENE_2_D("scene2d"),
        AUTUMN_MVC_BASIC("autumn-mvc-basic"),
        AUTUMN_MVC_BOX_2_D_VISUI("autumn-mvc-box2d-visui"),
        AUTUMN_MVC_VISUI("autumn-mvc-visui"),
        KIWI_INPUT_AWARE_APPLICATION_LISTENER("kiwi-input-aware-application-listener"),
        KIWI_ABSTRACT_APPLICATION_LISTENER("kiwi-abstract-application-listener"),
        LML_BASIC("lml-basic"),
        NOISE_4_J("noise4j"),
        VISUI_BASIC("visui-basic"),
        VISUI_SHOWCASE("visui-showcase"),
        WEBSOCKET_BASIC("websocket-basic");
        private final String value;
        private final static Map<String, GeneratorDto.Template> CONSTANTS = new HashMap<String, GeneratorDto.Template>();

        static {
            for (GeneratorDto.Template c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Template(String value) {
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
        public static GeneratorDto.Template fromValue(String value) {
            GeneratorDto.Template constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}