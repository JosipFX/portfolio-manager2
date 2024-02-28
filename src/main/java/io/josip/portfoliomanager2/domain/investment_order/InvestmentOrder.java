package io.josip.portfoliomanager2.domain.investment_order;

import static jakarta.persistence.EnumType.STRING;
import static java.sql.Types.VARCHAR;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;

import io.josip.portfoliomanager2.domain.investment.Investment;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "investment_order")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InvestmentOrder {

    @Id
    @Column
    @UuidGenerator
    @GeneratedValue
    @JdbcTypeCode(VARCHAR)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "investment_id", referencedColumnName = "id", nullable = false)
    private Investment investment;

    @Column(name = "price_per_share", nullable = false)
    private BigDecimal pricePerShare;

    @Enumerated(STRING)
    @Column(name = "side", nullable = false, length = 32)
    private InvestmentOrderSide side;

    @Column(name = "executed_at")
    private ZonedDateTime executedAt;

    @Column(name = "quantity", nullable = false)
    private BigDecimal quantity;

}
