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
        "libgdx",
        "java",
        "android-plugin",
        "android-target-api",
        "gwt-plugin",
        "application",
        "server-java",
        "desktop-java",
        "robovm"
})
public class Versions implements Serializable
{

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("libgdx")
    private String libgdx;
    @JsonProperty("java")
    private String java;
    @JsonProperty("android-plugin")
    private String androidPlugin;
    @JsonProperty("android-target-api")
    private Double androidTargetApi;
    @JsonProperty("gwt-plugin")
    private String gwtPlugin;
    @JsonProperty("application")
    private String application;
    @JsonProperty("server-java")
    private String serverJava;
    @JsonProperty("desktop-java")
    private String desktopJava;
    @JsonProperty("robovm")
    private String robovm;
    private final static long serialVersionUID = -6559366680891970802L;


    /**
     *
     * (Required)
     *
     */
    @JsonProperty("libgdx")
    public String getLibgdx() {
        return libgdx;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("libgdx")
    public void setLibgdx(String libgdx) {
        this.libgdx = libgdx;
    }

    @JsonProperty("java")
    public String getJava() {
        return java;
    }

    @JsonProperty("java")
    public void setJava(String java) {
        this.java = java;
    }

    @JsonProperty("android-plugin")
    public String getAndroidPlugin() {
        return androidPlugin;
    }

    @JsonProperty("android-plugin")
    public void setAndroidPlugin(String androidPlugin) {
        this.androidPlugin = androidPlugin;
    }

    @JsonProperty("android-target-api")
    public Double getAndroidTargetApi() {
        return androidTargetApi;
    }

    @JsonProperty("android-target-api")
    public void setAndroidTargetApi(Double androidTargetApi) {
        this.androidTargetApi = androidTargetApi;
    }

    @JsonProperty("gwt-plugin")
    public String getGwtPlugin() {
        return gwtPlugin;
    }

    @JsonProperty("gwt-plugin")
    public void setGwtPlugin(String gwtPlugin) {
        this.gwtPlugin = gwtPlugin;
    }

    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

    @JsonProperty("server-java")
    public String getServerJava() {
        return serverJava;
    }

    @JsonProperty("server-java")
    public void setServerJava(String serverJava) {
        this.serverJava = serverJava;
    }

    @JsonProperty("desktop-java")
    public String getDesktopJava() {
        return desktopJava;
    }

    @JsonProperty("desktop-java")
    public void setDesktopJava(String desktopJava) {
        this.desktopJava = desktopJava;
    }

    @JsonProperty("robovm")
    public String getRobovm() {
        return robovm;
    }

    @JsonProperty("robovm")
    public void setRobovm(String robovm) {
        this.robovm = robovm;
    }

}