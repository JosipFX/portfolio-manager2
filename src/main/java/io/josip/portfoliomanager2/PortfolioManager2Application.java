package io.josip.portfoliomanager2;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class PortfolioManager2Application {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioManager2Application.class, args);
    }

    private static final Logger LOG = LoggerFactory.getLogger(PortfolioManager2Application.class);

//    @Autowired
//    private CustomerRepository repository;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void runAfterStartup() {
//        List<Customer> allCustomers = this.repository.findAll();
//        LOG.info("Number of customers: " + allCustomers.size());
//
//        Customer newCustomer = new Customer();
//        newCustomer.setFirstName("John");
//        newCustomer.setLastName("Doe");
//        LOG.info("Saving new customer...");
//        this.repository.save(newCustomer);
//
//        allCustomers = this.repository.findAll();
//        LOG.info("Number of customers: " + allCustomers.size());
//    }

}
