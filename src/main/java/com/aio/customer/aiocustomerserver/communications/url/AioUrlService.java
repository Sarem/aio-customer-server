package com.aio.customer.aiocustomerserver.communications.url;

import com.aio.customer.aiocustomerserver.communications.login.AioLoginService;
import com.aio.customer.aiocustomerserver.communications.ping.AioPingService;
import com.aio.customer.aiocustomerserver.mapper.PingMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

@Component
public class AioUrlService {
    private static final String API_secret= "53dceb3c-69de-4ef3-ac07-c422471831e9";
    private static final String API_VERSION= "7.0";
    private static final String FORMAT= "json";
    private static final String CLIENT_ID= "8967603218900195425";
    private static final String API_RESOURCE= "client/channels/linear/getUrl";



    private final RestTemplate restTemplate;

    private AioLoginService aioLoginService;

    private AioPingService aioPingService;

    private final PingMapper pingMapper;



    @Autowired
    public AioUrlService(RestTemplate restTemplate, PingMapper pingMapper) {
        this.restTemplate = restTemplate;
        this.pingMapper = pingMapper;
    }

    @Autowired
    public void setLoginService(AioLoginService aioLoginService) {
         this.aioLoginService=aioLoginService;
    }

    @Autowired
    public void setAioPingService(AioPingService aioPingService) {
        this.aioPingService=aioPingService;
    }

    ObjectMapper mapper=new ObjectMapper();

    public String getURL() {
        UrlRequest urlRequest = getDefaultUrlRequest(aioLoginService.getSessionId());
        String predigest=API_secret+API_VERSION+FORMAT+CLIENT_ID+API_RESOURCE +urlRequest.toString();
        System.out.println(predigest);
        System.out.println(DigestUtils.md5DigestAsHex(predigest.getBytes()));

        ResponseEntity<String> result = restTemplate.postForEntity("https://tv-ext.aionet.ir/Catherine/api/"+API_VERSION+"/"+FORMAT+"/"+CLIENT_ID+"/"+ DigestUtils.md5DigestAsHex(predigest.getBytes())+"/"+API_RESOURCE,
                urlRequest, String.class);
        String url="";
        try {

            url = mapper.readValue(result.getBody(), UrlResponse.class).getUrl();
            aioPingService.startPing(pingMapper.createPingRequest(urlRequest));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return url;
    }

    private UrlRequest getDefaultUrlRequest(String sessionId){
            return new UrlRequest("52",
                    sessionId,"2260098679532838030","HLS_SECURE","fa-IR","_2D","AAC","TV",getDefaultSavePosition(),0,"LIVE");
        }
    public static SavePosition getDefaultSavePosition(){
        return new SavePosition(System.currentTimeMillis(), "TV", "52");
    }


}
