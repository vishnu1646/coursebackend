package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Coursecontroller {
    @PostMapping(path = "/addcourse",consumes = "application/json",produces = "application/json")
    public String adding(@RequestBody Course c){
        System.out.println(c.getTitle());
        System.out.println(c.getDescrip());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        return "adding course";
    }
    @GetMapping("/view")
    public String view(){
        return "viewing course";
    }
}
