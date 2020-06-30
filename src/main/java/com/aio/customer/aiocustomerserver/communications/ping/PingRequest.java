package com.aio.customer.aiocustomerserver.communications.ping;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "contentId",
        "delay",
        "savePosition",
        "sessionId",
        "locale",
        "type"
})
public class PingRequest implements Serializable
{

    @JsonProperty("contentId")
    private String contentId;
    @JsonProperty("delay")
    private Integer delay;
    @JsonProperty("savePosition")
    private SavePosition savePosition;
    @JsonProperty("sessionId")
    private String sessionId;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("type")
    private String type;
    private final static long serialVersionUID = 1233362433879516850L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PingRequest() {
    }

    /**
     *
     * @param delay
     * @param contentId
     * @param sessionId
     * @param locale
     * @param type
     * @param savePosition
     */
    public PingRequest(String contentId, Integer delay, SavePosition savePosition, String sessionId, String locale, String type) {
        super();
        this.contentId = contentId;
        this.delay = delay;
        this.savePosition = savePosition;
        this.sessionId = sessionId;
        this.locale = locale;
        this.type = type;
    }

    @JsonProperty("contentId")
    public String getContentId() {
        return contentId;
    }

    @JsonProperty("contentId")
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public PingRequest withContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    @JsonProperty("delay")
    public Integer getDelay() {
        return delay;
    }

    @JsonProperty("delay")
    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public PingRequest withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    @JsonProperty("savePosition")
    public SavePosition getSavePosition() {
        return savePosition;
    }

    @JsonProperty("savePosition")
    public void setSavePosition(SavePosition savePosition) {
        this.savePosition = savePosition;
    }

    public PingRequest withSavePosition(SavePosition savePosition) {
        this.savePosition = savePosition;
        return this;
    }

    @JsonProperty("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public PingRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public PingRequest withLocale(String locale) {
        this.locale = locale;
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

    public PingRequest withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "{\"contentId\":\"" + contentId +
                "\",\"delay\":" + delay +
                ",\"savePosition\":" + savePosition +
                ",\"sessionId\":\"" + sessionId +
                "\",\"type\":\"" + type +
                "\"}";

    }

}
