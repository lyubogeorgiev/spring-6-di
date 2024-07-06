package com.georgievl.spring6di.services.faux;

import com.georgievl.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev"})
@Service("fauxGreetingService")
public class DevelopmentGreetingService implements FauxService {
    @Override
    public String sayGreeting() {
        return "Hello Development GreetingService";
    }
}
