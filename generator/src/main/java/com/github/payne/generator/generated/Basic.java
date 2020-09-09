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
        "project-name",
        "core-package",
        "main-class",
        "android-sdk-path"
})
public class Basic implements Serializable
{

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("project-name")
    private String projectName;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("core-package")
    private String corePackage;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("main-class")
    private String mainClass;
    @JsonProperty("android-sdk-path")
    private String androidSdkPath;
    private final static long serialVersionUID = -1765243150270285526L;

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("project-name")
    public String getProjectName() {
        return projectName;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("project-name")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("core-package")
    public String getCorePackage() {
        return corePackage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("core-package")
    public void setCorePackage(String corePackage) {
        this.corePackage = corePackage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("main-class")
    public String getMainClass() {
        return mainClass;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("main-class")
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    @JsonProperty("android-sdk-path")
    public String getAndroidSdkPath() {
        return androidSdkPath;
    }

    @JsonProperty("android-sdk-path")
    public void setAndroidSdkPath(String androidSdkPath) {
        this.androidSdkPath = androidSdkPath;
    }

}