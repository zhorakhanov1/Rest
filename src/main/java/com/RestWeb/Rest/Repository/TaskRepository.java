package com.RestWeb.Rest.Repository;

import com.RestWeb.Rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

///Репозиторий для работы с Тасками
@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {


}