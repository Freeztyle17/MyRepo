package ru.dockerizedapplication.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dockerizedapplication.entities.Project;
import ru.dockerizedapplication.repositories.ProjectRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    @Override
    public Project createProject(Project project) {
        System.out.println(project);
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteProjectById(Long id) {
        projectRepository.deleteById(id);
    }
}
