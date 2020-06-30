package com.aio.customer.aiocustomerserver.services;

import com.aio.customer.aiocustomerserver.communications.url.AioUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoPlayerService {

    private final AioUrlService aioUrlService;

    public VideoPlayerService(AioUrlService aioUrlService) {
        this.aioUrlService = aioUrlService;
    }

    public String test(){
        return aioUrlService.getURL();
    }
}
