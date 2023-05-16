/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.portfolio.PortfolioWeb.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Project {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private Long id;
private String title;
private String snippet;
private String url;
}
