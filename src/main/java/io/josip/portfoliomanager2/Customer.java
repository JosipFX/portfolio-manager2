package io.josip.portfoliomanager2;

import static java.sql.Types.VARCHAR;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column
    @UuidGenerator
    @GeneratedValue
    @JdbcTypeCode(VARCHAR)
    private UUID id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
}