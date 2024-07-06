package com.georgievl.spring6di.services.faux;

import com.georgievl.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("fauxGreetingService")
public class ProductionGreetingService implements FauxService {
    @Override
    public String sayGreeting() {
        return "Hello Production GreetingService";
    }
}
