package com.example.qna.first.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.qna.first.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public void removeCourse(int id) 
    {
        int ind=-1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getId()==id)
            ind=i;
        }
        if(ind!=-1)
            list.remove(ind);
    }

    @Override
    public void addCourse(Course course) {

        list.add(course);
    }
    
}
