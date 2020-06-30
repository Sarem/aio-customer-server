package com.aio.customer.aiocustomerserver.communications.login;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


@Component
public class AioLoginService {

    private static final String API_secret= "53dceb3c-69de-4ef3-ac07-c422471831e9";
//    private static final String API_secret= "3641b618-8376-4486-ba54-985eb1d5ab19";//external
    private static final String API_VERSION= "7.0";
    private static final String FORMAT= "json";
    private static final String CLIENT_ID= "8967603218900195425";
//    private static final String client_ID= "304282037881639404";//external
    private static final String API_RESOURCE= "client/login";

    private final RestTemplate restTemplate;
    private String sessionId;

    @Autowired
    public AioLoginService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    ObjectMapper mapper = new ObjectMapper();
    MessageDigest md;

    {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public void initSession() {
        LoginRequest loginRequest=new LoginRequest("989169067831", "11111", "abc", "fa-IR");
        String predigest=API_secret+API_VERSION+FORMAT+CLIENT_ID+API_RESOURCE +loginRequest.toString();
        ResponseEntity<String> result = restTemplate.postForEntity("https://tv-ext.aionet.ir/Catherine/api/"+API_VERSION+"/"+FORMAT+"/"+CLIENT_ID+"/"+DigestUtils.md5DigestAsHex(predigest.getBytes())+"/"+API_RESOURCE,
                loginRequest, String.class);
        try {
            sessionId = mapper.readValue(result.getBody(), LoginResponse.class).getKey();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public String getSessionId() {
        if (sessionId == null)
            initSession();
        return sessionId;
    }


}
