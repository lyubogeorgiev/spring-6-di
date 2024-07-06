package com.georgievl.spring6di.controllers.faux;

import com.georgievl.spring6di.controllers.FauxController;
import com.georgievl.spring6di.services.GreetingService;
import com.georgievl.spring6di.services.faux.FauxService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
public class ProductionGreetingServiceTest {

    @Autowired
    private FauxController fauxController;

    @Test
    public void test() {
        System.out.println(fauxController.getGreeting());
    }
}
