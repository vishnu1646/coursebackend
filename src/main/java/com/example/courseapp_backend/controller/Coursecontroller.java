package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.Dao.CourseDao;
import com.example.courseapp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Coursecontroller {
    @Autowired
    private CourseDao da;
    @PostMapping(path = "/addcourse",consumes = "application/json",produces = "application/json")
    public String adding(@RequestBody Course c){
        System.out.println(c.getTitle());
        System.out.println(c.getDescrip());
        System.out.println(c.getvenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        da.save(c);
        return "adding course";
    }
    @GetMapping("/view")
    public List<Course> view(){
        return (List<Course>) da.findAll();
    }
}
