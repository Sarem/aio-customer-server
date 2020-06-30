package com.aio.customer.aiocustomerserver.communications.list;


import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "protocols",
        "pictureTypes",
        "audioFormats",
        "locale",
        "imageInfo"
})
public class ListRequest implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("protocols")
    private String protocols;
    @JsonProperty("pictureTypes")
    private String pictureTypes;
    @JsonProperty("audioFormats")
    private String audioFormats;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("imageInfo")
    private List<ImageInfo> imageInfo = null;
    private final static long serialVersionUID = -3995150353146744153L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ListRequest() {
    }

    /**
     *
     * @param audioFormats
     * @param imageInfo
     * @param pictureTypes
     * @param type
     * @param protocols
     * @param locale
     */
    public ListRequest(String type, String protocols, String pictureTypes, String audioFormats, String locale, List<ImageInfo> imageInfo) {
        super();
        this.type = type;
        this.protocols = protocols;
        this.pictureTypes = pictureTypes;
        this.audioFormats = audioFormats;
        this.locale = locale;
        this.imageInfo = imageInfo;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public ListRequest withType(String type) {
        this.type = type;
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

    public ListRequest withProtocols(String protocols) {
        this.protocols = protocols;
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

    public ListRequest withPictureTypes(String pictureTypes) {
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

    public ListRequest withAudioFormats(String audioFormats) {
        this.audioFormats = audioFormats;
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

    public ListRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    @JsonProperty("imageInfo")
    public List<ImageInfo> getImageInfo() {
        return imageInfo;
    }

    @JsonProperty("imageInfo")
    public void setImageInfo(List<ImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
    }

    public ListRequest withImageInfo(List<ImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    @Override
    public String toString() {
        return "{\"type\":\"" + type +
                "\",\"protocols\":\"" + protocols +
                "\",\"pictureTypes\":\"" + pictureTypes +
                "\",\"audioFormats\":\"" + audioFormats +
                "\",\"locale\":\"" + locale +
                "\",\"imageInfo\":" + imageInfo +
                "}";
    }
}