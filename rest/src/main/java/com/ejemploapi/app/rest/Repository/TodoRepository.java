package com.ejemploapi.app.rest.Repository;

import com.ejemploapi.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
