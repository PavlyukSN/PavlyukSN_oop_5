package org.example.service;


import org.example.model.LearnGroup;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.ArrayList;
import java.util.List;


public class DataLearnGroup implements LearnGroupService{
    List<LearnGroup> learnGroup = new ArrayList<>();


    @Override
    public List<LearnGroup> create(Teacher teacher, List<Student> studentList) {
        return null;
    }

    @Override
    public List<LearnGroup> createLearnGroup(Teacher teacher, List<Student> studentList) {
        learnGroup.add(teacher.getTeacherId());
        for(Student student : studentList) {
            learnGroup.add(student.getStudentId());
        }
        return learnGroup;
    }


    @Override
    public List<LearnGroup> readLearnGroup() {
        return learnGroup;
    }
}