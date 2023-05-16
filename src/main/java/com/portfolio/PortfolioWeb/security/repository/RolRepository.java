package com.portfolio.PortfolioWeb.security.repository;

import com.portfolio.PortfolioWeb.security.enums.RolNombre;
import com.portfolio.PortfolioWeb.security.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
