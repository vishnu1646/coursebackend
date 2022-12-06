package com.example.courseapp_backend.Dao;

import com.example.courseapp_backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
