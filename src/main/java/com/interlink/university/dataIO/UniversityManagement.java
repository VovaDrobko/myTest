package com.interlink.university.dataIO;

import com.interlink.university.institution.University;

public class UniversityManagement {
    private University university;

    public UniversityManagement(University university) {
        this.university = university;
        System.out.println();
    }

    public void readStudents(DataProvider dataProvider) {
        String line = dataProvider.read();
        System.out.println(line);
    }
}
