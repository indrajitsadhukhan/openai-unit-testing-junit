package com.example.qna.first.services;

import java.util.List;

import com.example.qna.first.entities.Course;

public interface CourseService {
    public List<Course> getCourses();
    public void addCourse(Course course);
    public void removeCourse(int id);
}
