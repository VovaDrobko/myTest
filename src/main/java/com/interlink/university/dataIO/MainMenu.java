package com.interlink.university.dataIO;

import com.interlink.university.institution.University;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.interlink.university.constants.Constants.DEFAULT_CHOICE_VALUE;

public class MainMenu {
    private University university;
    private DataProvider dataProvider;
    private UniversityManagement universityManagement;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public MainMenu() {
        int choice = DEFAULT_CHOICE_VALUE;
        while (choice != 0) {
            System.out.println("    Select command to do\n");
            System.out.println("1. Create university\n");
            System.out.println("2. Read students from file\n");
            System.out.println("3. Add students to university\n");
            System.out.println("4. Add students to internship\n");
            System.out.println("0. Exit\n");
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch(IOException e) {
                System.out.println("Input error in MainMenu class");
                e.printStackTrace();
            }

            switch(choice) {
                case 1 :
                    university = new University("CH.U.I.");
                    universityManagement = new UniversityManagement(university);
                    break;
                case 2 :
                    dataProvider = new DataProvider();
                    universityManagement.readStudents(dataProvider);
            }
        }
    }
}
