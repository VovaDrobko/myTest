package com.interlink.university.person;

import com.interlink.university.person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }
}
