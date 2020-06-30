package com.aio.customer.aiocustomerserver.communications;

import com.aio.customer.aiocustomerserver.communications.login.AioLoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AioLoginServiceTest {


    @Autowired
    AioLoginService aioLoginService;

    @Test
    public void doLoginTest() {
        System.out.println(aioLoginService.getSessionId());
    }


}