package org.example.model;

import java.util.List;
//— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>))
// формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
//— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя
// (его id) и формирования учебной группы, путём вызова метода из сервиса;
//— Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.


public class LearnGroup {

    Teacher teacher;
    List<Student> studentList;

    public LearnGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "LearnGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
