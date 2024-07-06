package com.georgievl.spring6di.controllers.faux;

import com.georgievl.spring6di.controllers.FauxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
public class UserAcceptanceTestingGreetingServiceTest {

    @Autowired
    private FauxController fauxController;

    @Test
    public void testGreeting() {
        System.out.println(fauxController.getGreeting());
    }
}
