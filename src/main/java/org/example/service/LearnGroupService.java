package org.example.service;

import org.example.model.LearnGroup;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;

import java.util.List;

public interface LearnGroupService {
    List<LearnGroup> create(Teacher teacher, List<Student> studentList);

//    Student create(User user);

    List<LearnGroup> createLearnGroup(Teacher teacher, List<Student> studentList);

    List<LearnGroup> readLearnGroup();
}