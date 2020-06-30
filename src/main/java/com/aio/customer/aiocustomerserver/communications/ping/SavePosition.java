package com.aio.customer.aiocustomerserver.communications.ping;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "position",
        "type",
        "contentId"
})
public class SavePosition implements Serializable {

    @JsonProperty("position")
    private Long position;
    @JsonProperty("type")
    private String type;
    @JsonProperty("contentId")
    private String contentId;
    private final static long serialVersionUID = -1789358206627716896L;

    /**
     * No args constructor for use in serialization
     */
    public SavePosition() {
    }

    /**
     * @param contentId
     * @param position
     * @param type
     */
    public SavePosition(Long position, String type, String contentId) {
        super();
        this.position = position;
        this.type = type;
        this.contentId = contentId;
    }

    @JsonProperty("position")
    public Long getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Long position) {
        this.position = position;
    }

    public SavePosition withPosition(Long position) {
        this.position = position;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public SavePosition withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public SavePosition withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    @Override
    public String toString() {
        return "{\"position\":" + position +
                ",\"type\":\"" + type +
                "\",\"contentId\":\"" + contentId +
                "\"}";
    }

}
