package io.josip.portfoliomanager2.domain.app_user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.josip.portfoliomanager2.domain.app_user.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
}
