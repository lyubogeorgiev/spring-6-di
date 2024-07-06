package com.georgievl.spring6di;

import com.georgievl.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6diApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Spring6diApplication.class, args);

        MyController myController = applicationContext.getBean(MyController.class);

        System.out.println("In Main Method");
        System.out.println(myController.sayHello());
    }

}
