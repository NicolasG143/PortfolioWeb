package com.portfolio.PortfolioWeb.security.model;

import com.portfolio.PortfolioWeb.security.enums.RolNombre;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    RolNombre rolNombre;

    public Rol(){

    }

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }


}
