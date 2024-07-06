package com.georgievl.spring6di.services.faux;

import com.georgievl.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("fauxGreetingService")
public class UserAcceptanceTestingGreetingService implements FauxService {
    @Override
    public String sayGreeting() {
        return "Hello User Acceptance Testing GreetingService";
    }
}
