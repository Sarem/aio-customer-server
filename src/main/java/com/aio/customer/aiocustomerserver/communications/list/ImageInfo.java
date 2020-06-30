package com.aio.customer.aiocustomerserver.communications.list;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "height",
        "width"
})
public class ImageInfo implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("width")
    private Integer width;
    private final static long serialVersionUID = -1266019293406049198L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ImageInfo() {
    }

    /**
     *
     * @param width
     * @param type
     * @param height
     */
    public ImageInfo(String type, Integer height, Integer width) {
        super();
        this.type = type;
        this.height = height;
        this.width = width;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public ImageInfo withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public ImageInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public ImageInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public String toString() {

        return "{\"type\":\"" + type +
                "\",\"height\":" + height +
                ",\"width\":" + width +
                "}";
    }

}
