/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.portfolio.PortfolioWeb.controller;

import com.portfolio.PortfolioWeb.model.Project;
import com.portfolio.PortfolioWeb.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    
    @Autowired
    private IProjectService interProject;
    
    @GetMapping("/projects/traer")
    public List<Project> getProjects(){
        return interProject.getProjects();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/projects/crear")
    public String createProject(@RequestBody Project project){
        interProject.saveProject(project);
        return "Creado exitosamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/projects/eliminar/{id}")
    public String deleteProject(@PathVariable Long id){
        interProject.deleteProject(id);
        return "Eliminado correctamente";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/projects/editar/{id}")
    public Project editProject(@PathVariable Long id,
                               @RequestBody Project newProject){
        Project project = interProject.findProject(id);
        project.setTitle(newProject.getTitle());
        project.setSnippet(newProject.getSnippet());
        project.setUrl(newProject.getUrl());
        interProject.saveProject(project);
        return project;
    }
    
}
