package com.aio.customer.aiocustomerserver.communications;

import java.util.Arrays;
import java.util.stream.Collectors;

//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Arrays;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
public class TestMD5 {
/*
    channelId: "10"
    sessionId: "f344a737230e24a-5facd636a62407fb-476674a309e4b3c1-6190b97a2d02446f"
    profileGuid: "6521989997579833641"
    protocols: "HLS_SECURE"
    locale: "fa-IR"
    pictureTypes: "_2D"
    audioFormats: "AAC"
    channelType: "TV"
    savePosition:
    {       position: 1578915432144,
            type:"TV"
            , contentId: "10"}
    position: 1578915432144
    type: "TV"
    contentId: "10"
    delay: "1"
    playbackType: "PLTV"
  */


    public static void main(String[] args) {
        System.out.println("dsad");
        System.out.println(Arrays.asList
                ("channelId","sessionId","profileGuid","protocols","locale","pictureTypes","audioFormats","channelType","position","type","contentId","delay","playbackType").stream().sorted().collect(Collectors.toList()));

        System.out.println(Arrays.asList
                ("username","password","deviceName","locale").stream().sorted().collect(Collectors.toList()));

    }


}
