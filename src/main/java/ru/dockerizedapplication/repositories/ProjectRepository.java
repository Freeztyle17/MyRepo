package ru.dockerizedapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dockerizedapplication.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
