package com.interlink.university.institution;

import com.interlink.university.institution.interlink.Internship;
import com.interlink.university.person.Student;
import com.interlink.university.person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Student> students;
    private Internship internship;

    public University(String name) {
        this.name = name;
        students = new ArrayList<Student>();
        internship = new Internship("Interlink");
    }

    private double getAverageKnowledgeLevel() {
        double sum = 0;
        int numberOfStudents = students.size();
        for (Student student : students) {
            sum += student.getKnowledge().getLevel();
        }
        return sum / (double)numberOfStudents;
    }

    public void sentStudentsToInternship() {
        for (Student student : students) {
            verifyStudentsLevel(student);
        }
    }

    private void verifyStudentsLevel(Student student) {
        if (student.getKnowledge().getLevel() >= getAverageKnowledgeLevel())
            internship.setStudent(student);
    }

    public void addStudent(Student student) {
        //Z
        //Z
        student.setKnowledge(new Knowledge(100));
        students.add(student);
    }

    public Internship getInternship() {
        return internship;
    }
}
