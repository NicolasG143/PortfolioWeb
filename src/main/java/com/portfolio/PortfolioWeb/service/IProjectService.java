/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.portfolio.PortfolioWeb.service;

import com.portfolio.PortfolioWeb.model.Project;
import java.util.List;


public interface IProjectService {
    
    public List<Project> getProjects();
    
    public void saveProject(Project project);
    
    public void deleteProject(Long id);
    
    public Project findProject(Long id);
}
