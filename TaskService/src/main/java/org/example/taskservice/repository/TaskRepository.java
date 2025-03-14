package org.example.taskservice.repository;

import org.example.taskservice.modal.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface TaskRepository extends JpaRepository<Task,Long> {

    public List<Task> findByassignedUserId(Long userId);
}

