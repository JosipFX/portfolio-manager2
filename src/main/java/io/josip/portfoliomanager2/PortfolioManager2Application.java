package io.josip.portfoliomanager2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import io.josip.portfoliomanager2.service.SampleDataCreatorService;

@SpringBootApplication
public class PortfolioManager2Application {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioManager2Application.class, args);
    }

    private static final Logger LOG = LoggerFactory.getLogger(PortfolioManager2Application.class);

    @Autowired
    private SampleDataCreatorService sampleDataCreatorService;

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
//        sampleDataCreatorService.createSampleData();
    }

}
