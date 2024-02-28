package io.josip.portfoliomanager2.service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.josip.portfoliomanager2.domain.app_user.AppUser;
import io.josip.portfoliomanager2.domain.app_user.AppUserRepository;
import io.josip.portfoliomanager2.domain.investment.Investment;
import io.josip.portfoliomanager2.domain.investment.InvestmentRepository;
import io.josip.portfoliomanager2.domain.investment_order.InvestmentOrder;
import io.josip.portfoliomanager2.domain.investment_order.InvestmentOrderRepository;
import io.josip.portfoliomanager2.domain.portfolio.Portfolio;
import io.josip.portfoliomanager2.domain.portfolio.PortfolioRepository;

@Service
public class SampleDataCreatorService {

    //---- Static

    private static final Logger LOG = LoggerFactory.getLogger(SampleDataCreatorService.class);


    //---- Fields

    private final AppUserRepository appUserRepository;
    private final PortfolioRepository portfolioRepository;
    private final InvestmentRepository investmentRepository;
    private final InvestmentOrderRepository investmentOrderRepository;


    //---- Constructor

    @Autowired
    public SampleDataCreatorService(AppUserRepository appUserRepository, PortfolioRepository portfolioRepository,
            InvestmentRepository investmentRepository, InvestmentOrderRepository investmentOrderRepository) {
        this.appUserRepository = appUserRepository;
        this.portfolioRepository = portfolioRepository;
        this.investmentRepository = investmentRepository;
        this.investmentOrderRepository = investmentOrderRepository;
    }


    //---- Methods

    /**
     * Creates sample data.
     */
    public void createSampleData() {
        LOG.info("Creating sample data...");

        AppUser user = AppUser.builder()
            .username("user1")
            .email("user1@example.com")
            .password("password123")
            .createdAt(ZonedDateTime.now())
            .build();
        appUserRepository.save(user);

        Portfolio portfolio1 = Portfolio.builder()
            .name("My first portfolio")
            .user(user)
            .createdAt(ZonedDateTime.now())
            .build();
        portfolioRepository.save(portfolio1);

        Portfolio portfolio2 = Portfolio.builder()
            .name("My second portfolio")
            .user(user)
            .createdAt(ZonedDateTime.now())
            .build();
        portfolioRepository.save(portfolio2);

        Investment investment1 = Investment.builder()
            .portfolio(portfolio1)
            .assetType("Stock")
            .assetName("AAPL")
            .quantity(BigDecimal.valueOf(10))
            .build();
        investmentRepository.save(investment1);

        InvestmentOrder order1 = InvestmentOrder.builder()
            .investment(investment1)
            .pricePerShare(new BigDecimal("150"))
            .side("BUY")
            .executedAt(ZonedDateTime.now())
            .quantity(BigDecimal.valueOf(10))
            .build();
        investmentOrderRepository.save(order1);

        Investment investment2 = Investment.builder()
            .portfolio(portfolio2)
            .assetType("Stock")
            .assetName("MSFT")
            .quantity(BigDecimal.valueOf(20))
            .build();
        investmentRepository.save(investment2);

        InvestmentOrder order2 = InvestmentOrder.builder()
            .investment(investment2)
            .pricePerShare(new BigDecimal("200"))
            .side("BUY")
            .executedAt(ZonedDateTime.now())
            .quantity(BigDecimal.valueOf(20))
            .build();
        investmentOrderRepository.save(order2);

        LOG.info("Sample data creation complete.");
    }

}
