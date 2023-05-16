package com.portfolio.PortfolioWeb.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mensaje {
    private String msg;

    public Mensaje(String mensaje){this.msg = mensaje;}
}
