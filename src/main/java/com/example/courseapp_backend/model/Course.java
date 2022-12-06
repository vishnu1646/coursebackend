package com.example.courseapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courseapp")
public class Course {
    @Id
    @GeneratedValue
    private int Id;
    private String title;
    private String descrip;
    private String venue;
    private String duration;
    private String date;

    public Course() {
    }

    public Course(int id, String title, String descrip, String venue, String duration, String date) {
        Id = id;
        this.title = title;
        this.descrip = descrip;
        this.venue = venue;
        this.duration = duration;
        this.date = date;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getvenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
