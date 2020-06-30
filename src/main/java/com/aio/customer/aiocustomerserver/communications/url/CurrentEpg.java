package com.aio.customer.aiocustomerserver.communications.url;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
//import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "channelId",
        "startTimestamp",
        "endTimestamp",
        "name"
})
public class CurrentEpg implements Serializable {

    @JsonProperty("channelId")
    private Integer channelId;
    @JsonProperty("startTimestamp")
    private String startTimestamp;
    @JsonProperty("endTimestamp")
    private String endTimestamp;
    @JsonProperty("name")
    private String name;
    private final static long serialVersionUID = -2300160734235437359L;

    /**
     * No args constructor for use in serialization
     */
    public CurrentEpg() {
    }

    /**
     * @param name
     * @param endTimestamp
     * @param channelId
     * @param startTimestamp
     */
    public CurrentEpg(Integer channelId, String startTimestamp, String endTimestamp, String name) {
        super();
        this.channelId = channelId;
        this.startTimestamp = startTimestamp;
        this.endTimestamp = endTimestamp;
        this.name = name;
    }

    @JsonProperty("channelId")
    public Integer getChannelId() {
        return channelId;
    }

    @JsonProperty("channelId")
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public CurrentEpg withChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }

    @JsonProperty("startTimestamp")
    public String getStartTimestamp() {
        return startTimestamp;
    }

    @JsonProperty("startTimestamp")
    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public CurrentEpg withStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    @JsonProperty("endTimestamp")
    public String getEndTimestamp() {
        return endTimestamp;
    }

    @JsonProperty("endTimestamp")
    public void setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public CurrentEpg withEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CurrentEpg withName(String name) {
        this.name = name;
        return this;
    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("channelId", channelId).append("startTimestamp", startTimestamp).append("endTimestamp", endTimestamp).append("name", name).toString();
//    }

}
