package com.portfolio.PortfolioWeb.security.service;


import com.portfolio.PortfolioWeb.security.enums.RolNombre;
import com.portfolio.PortfolioWeb.security.model.Rol;
import com.portfolio.PortfolioWeb.security.repository.RolRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
}
