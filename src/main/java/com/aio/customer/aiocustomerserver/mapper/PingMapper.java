package com.aio.customer.aiocustomerserver.mapper;

import com.aio.customer.aiocustomerserver.communications.ping.PingRequest;
import com.aio.customer.aiocustomerserver.communications.url.UrlRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PingMapper {

    @Mapping(source = "channelId", target = "contentId")
    @Mapping(source = "channelType", target = "type")
    PingRequest createPingRequest(UrlRequest urlRequest);

}
