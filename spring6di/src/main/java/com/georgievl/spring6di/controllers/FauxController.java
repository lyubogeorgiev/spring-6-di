package com.georgievl.spring6di.controllers;

import com.georgievl.spring6di.services.GreetingService;
import com.georgievl.spring6di.services.faux.FauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    private final FauxService greetingService;

    @Autowired
    public FauxController(@Qualifier("fauxGreetingService") FauxService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
