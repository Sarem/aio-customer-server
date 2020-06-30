package com.aio.customer.aiocustomerserver.controller;

import com.aio.customer.aiocustomerserver.services.VideoPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class VideoPlayerController {

    private final VideoPlayerService videoPlayerService;

    @Autowired
    public VideoPlayerController(VideoPlayerService videoPlayerService) {
        this.videoPlayerService = videoPlayerService;
    }

    @GetMapping("/test")
    public String getUrlTest(){
        return videoPlayerService.test();
    }
}
