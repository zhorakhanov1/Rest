package com.RestWeb.Rest.Repository;

import com.RestWeb.Rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JPARepository which works with Task
public interface TaskRepository extends JpaRepository<Task,Long> {


}