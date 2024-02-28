package io.josip.portfoliomanager2.domain.investment_order;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.josip.portfoliomanager2.domain.investment_order.InvestmentOrder;

@Repository
public interface InvestmentOrderRepository extends JpaRepository<InvestmentOrder, UUID> {
}
