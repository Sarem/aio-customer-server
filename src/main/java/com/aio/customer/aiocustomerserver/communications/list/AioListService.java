package com.aio.customer.aiocustomerserver.communications.list;

import com.aio.customer.aiocustomerserver.communications.login.AioLoginService;
import com.aio.customer.aiocustomerserver.communications.url.SavePosition;
import com.aio.customer.aiocustomerserver.communications.url.UrlRequest;
import com.aio.customer.aiocustomerserver.communications.url.UrlResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

@Component
public class AioListService {
    private static final String API_secret = "53dceb3c-69de-4ef3-ac07-c422471831e9";
    private static final String API_VERSION = "7.0";
    private static final String FORMAT = "json";
    private static final String CLIENT_ID = "8967603218900195425";
    private static final String API_RESOURCE = "client/channels/list";


    private final RestTemplate restTemplate;

    private AioLoginService aioLoginService;


    @Autowired
    public AioListService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    public void setLoginService(AioLoginService aioLoginService) {
        this.aioLoginService = aioLoginService;
    }


//    ObjectMapper mapper = new ObjectMapper();

    public String getChanelList() {
        ListRequest listRequest = getDefaultListRequest(aioLoginService.getSessionId());
        String predigest = API_secret + API_VERSION + FORMAT + CLIENT_ID + API_RESOURCE + listRequest.toString();
        System.out.println(predigest);
        System.out.println(DigestUtils.md5DigestAsHex(predigest.getBytes()));

        ResponseEntity<String> result = restTemplate.postForEntity("https://tv-ext.aionet.ir/Catherine/api/" + API_VERSION + "/" + FORMAT + "/" + CLIENT_ID + "/" + DigestUtils.md5DigestAsHex(predigest.getBytes()) + "/" + API_RESOURCE,
                listRequest, String.class);
//        String chanelList = "";
//        try {
//
//            chanelList = mapper.readValue(result.getBody(), ListResponse.class);
//
//
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
        return result.getBody();
    }

    private ListRequest getDefaultListRequest(String sessionId) {
        return new ListRequest();
    }




}
