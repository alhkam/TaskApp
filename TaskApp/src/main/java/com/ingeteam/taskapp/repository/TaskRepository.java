package com.ingeteam.taskapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ingeteam.taskapp.entity.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}
