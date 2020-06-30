package com.aio.customer.aiocustomerserver.communications.url;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pltvEnabled",
        "currentEpg",
        "url",
        "protocol",
        "protocolType",
        "pictureType",
        "parseSubtitlesFromStream",
        "parseAudioTracksFromStream",
        "currentTime"
})
public class UrlResponse implements Serializable {

    @JsonProperty("pltvEnabled")
    private Boolean pltvEnabled;
    @JsonProperty("currentEpg")
    private List<CurrentEpg> currentEpg = null;
    @JsonProperty("url")
    private String url;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("protocolType")
    private String protocolType;
    @JsonProperty("pictureType")
    private String pictureType;
    @JsonProperty("parseSubtitlesFromStream")
    private Boolean parseSubtitlesFromStream;
    @JsonProperty("parseAudioTracksFromStream")
    private Boolean parseAudioTracksFromStream;
    @JsonProperty("currentTime")
    private String currentTime;
    private final static long serialVersionUID = -6354038073205434674L;

    /**
     * No args constructor for use in serialization
     */
    public UrlResponse() {
    }

    /**
     * @param currentTime
     * @param protocol
     * @param currentEpg
     * @param protocolType
     * @param parseSubtitlesFromStream
     * @param pltvEnabled
     * @param pictureType
     * @param url
     * @param parseAudioTracksFromStream
     */
    public UrlResponse(Boolean pltvEnabled, List<CurrentEpg> currentEpg, String url, String protocol, String protocolType, String pictureType, Boolean parseSubtitlesFromStream, Boolean parseAudioTracksFromStream, String currentTime) {
        super();
        this.pltvEnabled = pltvEnabled;
        this.currentEpg = currentEpg;
        this.url = url;
        this.protocol = protocol;
        this.protocolType = protocolType;
        this.pictureType = pictureType;
        this.parseSubtitlesFromStream = parseSubtitlesFromStream;
        this.parseAudioTracksFromStream = parseAudioTracksFromStream;
        this.currentTime = currentTime;
    }

    @JsonProperty("pltvEnabled")
    public Boolean getPltvEnabled() {
        return pltvEnabled;
    }

    @JsonProperty("pltvEnabled")
    public void setPltvEnabled(Boolean pltvEnabled) {
        this.pltvEnabled = pltvEnabled;
    }

    public UrlResponse withPltvEnabled(Boolean pltvEnabled) {
        this.pltvEnabled = pltvEnabled;
        return this;
    }

    @JsonProperty("currentEpg")
    public List<CurrentEpg> getCurrentEpg() {
        return currentEpg;
    }

    @JsonProperty("currentEpg")
    public void setCurrentEpg(List<CurrentEpg> currentEpg) {
        this.currentEpg = currentEpg;
    }

    public UrlResponse withCurrentEpg(List<CurrentEpg> currentEpg) {
        this.currentEpg = currentEpg;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public UrlResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public UrlResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    @JsonProperty("protocolType")
    public String getProtocolType() {
        return protocolType;
    }

    @JsonProperty("protocolType")
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public UrlResponse withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    @JsonProperty("pictureType")
    public String getPictureType() {
        return pictureType;
    }

    @JsonProperty("pictureType")
    public void setPictureType(String pictureType) {
        this.pictureType = pictureType;
    }

    public UrlResponse withPictureType(String pictureType) {
        this.pictureType = pictureType;
        return this;
    }

    @JsonProperty("parseSubtitlesFromStream")
    public Boolean getParseSubtitlesFromStream() {
        return parseSubtitlesFromStream;
    }

    @JsonProperty("parseSubtitlesFromStream")
    public void setParseSubtitlesFromStream(Boolean parseSubtitlesFromStream) {
        this.parseSubtitlesFromStream = parseSubtitlesFromStream;
    }

    public UrlResponse withParseSubtitlesFromStream(Boolean parseSubtitlesFromStream) {
        this.parseSubtitlesFromStream = parseSubtitlesFromStream;
        return this;
    }

    @JsonProperty("parseAudioTracksFromStream")
    public Boolean getParseAudioTracksFromStream() {
        return parseAudioTracksFromStream;
    }

    @JsonProperty("parseAudioTracksFromStream")
    public void setParseAudioTracksFromStream(Boolean parseAudioTracksFromStream) {
        this.parseAudioTracksFromStream = parseAudioTracksFromStream;
    }

    public UrlResponse withParseAudioTracksFromStream(Boolean parseAudioTracksFromStream) {
        this.parseAudioTracksFromStream = parseAudioTracksFromStream;
        return this;
    }

    @JsonProperty("currentTime")
    public String getCurrentTime() {
        return currentTime;
    }

    @JsonProperty("currentTime")
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public UrlResponse withCurrentTime(String currentTime) {
        this.currentTime = currentTime;
        return this;
    }


}
