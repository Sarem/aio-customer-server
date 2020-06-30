package com.aio.customer.aiocustomerserver.communications;

import com.aio.customer.aiocustomerserver.communications.url.AioUrlService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class AioUrlServiceTest {



    @Autowired
    AioUrlService aioUrlService;

    @Test
    void getURL() {
        System.out.println(aioUrlService.getURL());
    }
}