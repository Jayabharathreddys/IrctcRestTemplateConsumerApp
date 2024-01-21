package com.jb.makemytrip2;

import com.jb.makemytrip2.bindings.Ticket;
import com.jb.makemytrip2.service.MakeMyTripService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class MakeMyTrip2Application {

    public static void main(String[] args) {

       // ConfigurableApplicationContext context =
                SpringApplication.run(MakeMyTrip2Application.class, args);

        /*MakeMyTripService bean = context.getBean(MakeMyTripService.class);
        List<Ticket> allTickets = bean.getAllTickets();
        allTickets.forEach(System.out::println);
*/    }


}
