package com.RestWeb.Rest.Repository;

import com.RestWeb.Rest.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

//JPARepository which works with Project
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
