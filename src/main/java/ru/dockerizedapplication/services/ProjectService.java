package ru.dockerizedapplication.services;

import ru.dockerizedapplication.entities.Project;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project);

    List<Project> getAllProject();

    Project getProjectById(Long id);

    void deleteProjectById(Long id);
}
