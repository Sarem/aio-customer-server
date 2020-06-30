package com.aio.customer.aiocustomerserver.communications.url;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "channelId",
        "sessionId",
        "profileGuid",
        "protocols",
        "locale",
        "pictureTypes",
        "audioFormats",
        "channelType",
        "savePosition",
        "delay",
        "playbackType"
})
public class UrlRequest implements Serializable {

    @JsonProperty("channelId")
    private String channelId;
    @JsonProperty("sessionId")
    private String sessionId;
    @JsonProperty("profileGuid")
    private String profileGuid;
    @JsonProperty("protocols")
    private String protocols;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("pictureTypes")
    private String pictureTypes;
    @JsonProperty("audioFormats")
    private String audioFormats;
    @JsonProperty("channelType")
    private String channelType;
    @JsonProperty("savePosition")
    private SavePosition savePosition;
    @JsonProperty("delay")
    private Integer delay;
    @JsonProperty("playbackType")
    private String playbackType;
    private final static long serialVersionUID = 8807110720262617069L;

    /**
     * No args constructor for use in serialization
     */
    public UrlRequest() {
    }

    /**
     * @param profileGuid
     * @param delay
     * @param audioFormats
     * @param channelType
     * @param sessionId
     * @param pictureTypes
     * @param protocols
     * @param locale
     * @param savePosition
     * @param channelId
     * @param playbackType
     */
    public UrlRequest(String channelId, String sessionId, String profileGuid, String protocols, String locale, String pictureTypes, String audioFormats, String channelType, SavePosition savePosition, Integer delay, String playbackType) {
        super();
        this.channelId = channelId;
        this.sessionId = sessionId;
        this.profileGuid = profileGuid;
        this.protocols = protocols;
        this.locale = locale;
        this.pictureTypes = pictureTypes;
        this.audioFormats = audioFormats;
        this.channelType = channelType;
        this.savePosition = savePosition;
        this.delay = delay;
        this.playbackType = playbackType;
    }

    @JsonProperty("channelId")
    public String getChannelId() {
        return channelId;
    }

    @JsonProperty("channelId")
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public UrlRequest withChannelId(String channelId) {
        this.channelId = channelId;
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

    public UrlRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    @JsonProperty("profileGuid")
    public String getProfileGuid() {
        return profileGuid;
    }

    @JsonProperty("profileGuid")
    public void setProfileGuid(String profileGuid) {
        this.profileGuid = profileGuid;
    }

    public UrlRequest withProfileGuid(String profileGuid) {
        this.profileGuid = profileGuid;
        return this;
    }

    @JsonProperty("protocols")
    public String getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(String protocols) {
        this.protocols = protocols;
    }

    public UrlRequest withProtocols(String protocols) {
        this.protocols = protocols;
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

    public UrlRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    @JsonProperty("pictureTypes")
    public String getPictureTypes() {
        return pictureTypes;
    }

    @JsonProperty("pictureTypes")
    public void setPictureTypes(String pictureTypes) {
        this.pictureTypes = pictureTypes;
    }

    public UrlRequest withPictureTypes(String pictureTypes) {
        this.pictureTypes = pictureTypes;
        return this;
    }

    @JsonProperty("audioFormats")
    public String getAudioFormats() {
        return audioFormats;
    }

    @JsonProperty("audioFormats")
    public void setAudioFormats(String audioFormats) {
        this.audioFormats = audioFormats;
    }

    public UrlRequest withAudioFormats(String audioFormats) {
        this.audioFormats = audioFormats;
        return this;
    }

    @JsonProperty("channelType")
    public String getChannelType() {
        return channelType;
    }

    @JsonProperty("channelType")
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public UrlRequest withChannelType(String channelType) {
        this.channelType = channelType;
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

    public UrlRequest withSavePosition(SavePosition savePosition) {
        this.savePosition = savePosition;
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

    public UrlRequest withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    @JsonProperty("playbackType")
    public String getPlaybackType() {
        return playbackType;
    }

    @JsonProperty("playbackType")
    public void setPlaybackType(String playbackType) {
        this.playbackType = playbackType;
    }

    public UrlRequest withPlaybackType(String playbackType) {
        this.playbackType = playbackType;
        return this;
    }

    @Override
    public String toString() {
        return "{\"channelId\":\"" + channelId +
                "\",\"sessionId\":\"" + sessionId +
                "\",\"profileGuid\":\"" + profileGuid +
                "\",\"protocols\":\"" + protocols +
                "\",\"locale\":\"" + locale +
                "\",\"pictureTypes\":\"" + pictureTypes +
                "\",\"audioFormats\":\"" + audioFormats +
                "\",\"channelType\":\"" + channelType +
                "\",\"savePosition\":" + savePosition +
                ",\"delay\":" + delay +
                ",\"playbackType\":\"" + playbackType +
                "\"}";

    }

}