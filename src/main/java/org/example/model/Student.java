package org.example.model;

public class Student extends User{
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    private Integer studentId;
    private Double average;
    public Student (Integer age, String name, Double average) {
        super(age, name);
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", average=" + average +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public LearnGroup getStudentId() {
        return null;
    }
}
