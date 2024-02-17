package org.example.controller;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.User;
import org.example.service.DataLearnGroup;
import org.example.service.DataStudent;
import org.example.service.DataTeacher;
import org.example.view.LearnGroupView;
import org.example.view.StudentView;

import java.util.List;

public class Controller {

    private DataStudent dataStudent;
    private DataTeacher dataTeacher;
    private DataLearnGroup dataLearnGroup;
    private StudentView studentView;
    private LearnGroupView learnGroupView;
    public void start(){

        User user1 = new Student(21,"Юра",4.5);
        User user2 =new Teacher(40, "Иван", "math");
        User user3 = new Student(18,"Ира",4.1);
        createStudent(user1);
        createTeacher(user2);
        createStudent(user3);
        List<Student> LstStudent = dataStudent.read();
        studentView.pintStudent(LstStudent);
        createLearnGroup(user2,LstStudent);
        dataLearnGroup.createLearnGroup((Teacher)user2, LstStudent);
        learnGroupView.printLearnGroup(dataLearnGroup.readLearnGroup());


    }
    public void createStudent(User user){
        dataStudent.create(user);
    }

    public void createTeacher(User user){
        dataTeacher.create(user);
    }

    public void createLearnGroup(User user, List<Student> studentList) {
        dataLearnGroup.readLearnGroup();
    }

    public Controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        studentView = new StudentView();
        dataLearnGroup = new DataLearnGroup();
        learnGroupView = new LearnGroupView();
    }

}
