package com.example.demo.dao;

import com.example.demo.util.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks, Long> {

}
