package com.interlink.university.institution.interlink;

import com.interlink.university.person.Student;

import java.util.ArrayList;
import java.util.List;


public class Internship {
    private String name;
    private List<Student> internshipStudents;

    public Internship(String name) {
        this.name = name;
        internshipStudents = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        internshipStudents.add(student);
    }

    public String getStudents() {
        return toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Internship name : ");
        sb.append(name);
        sb.append("\nList of internship's students:\n");
        for (Student student : internshipStudents) {
            sb.append(student.getName());
            sb.append(" - ");
            sb.append(student.getKnowledge().getLevel());
            sb.append("\n");
        }
        return sb.toString();
    }
}
