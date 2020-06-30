package com.aio.customer.aiocustomerserver.communications.ping;

import ch.qos.logback.core.util.ExecutorServiceUtil;
import com.aio.customer.aiocustomerserver.communications.login.AioLoginService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

@Component
public class AioPingService {
    private static final String API_secret= "53dceb3c-69de-4ef3-ac07-c422471831e9";
    private static final String API_VERSION= "7.0";
    private static final String FORMAT= "json";
    private static final String CLIENT_ID= "8967603218900195425";
    private static final String API_RESOURCE= "client/ping";



    private final RestTemplate restTemplate;

    private AioLoginService aioLoginService;

    @Autowired
    public AioPingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    public void setLoginService(AioLoginService aioLoginService) {
        this.aioLoginService=aioLoginService;
    }

    ObjectMapper mapper=new ObjectMapper();

    public void startPing(PingRequest pingRequest){
        ExecutorServiceUtil.newExecutorService().execute(() ->{
            System.out.println( pingRequest);
            try {
                Thread.sleep(20000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } );
        System.out.println(pingRequest);
    }

    private void doPing(PingRequest pingRequest) {
        String predigest=API_secret+API_VERSION+FORMAT+CLIENT_ID+API_RESOURCE +pingRequest.toString();
        System.out.println(predigest);
        System.out.println(DigestUtils.md5DigestAsHex(predigest.getBytes()));

        ResponseEntity<String> result = restTemplate.postForEntity("https://tv-ext.aionet.ir/Catherine/api/"+API_VERSION+"/"+FORMAT+"/"+CLIENT_ID+"/"+ DigestUtils.md5DigestAsHex(predigest.getBytes())+"/"+API_RESOURCE,
                pingRequest, String.class);
    }
}
