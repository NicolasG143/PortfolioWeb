/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.portfolio.PortfolioWeb.service;

import com.portfolio.PortfolioWeb.model.Project;
import com.portfolio.PortfolioWeb.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {
    @Autowired
    private ProjectRepository repo;

    @Override
    public List<Project> getProjects() {
        return repo.findAll();
    }
    @Override
    public void saveProject(Project project) {
        repo.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        repo.deleteById(id);
    }
    
    @Override
    public Project findProject(Long id){
        return repo.findById(id).orElse(null);
    }
}
