package com.georgievl.spring6di.controllers.faux;

import com.georgievl.spring6di.controllers.FauxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
public class DevelopmentGreetingServiceTest {

    @Autowired
    private FauxController fauxController;

    @Test
    void testGreeting() {
        System.out.println(fauxController.getGreeting());
    }
}
