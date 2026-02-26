package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnelDataTest {

    @Test
    void getName() {
        PersonnelData personal=new PersonnelData("Roberto","Data Science",1999);
        assertEquals("Roberto",personal.getName());
    }

    @Test
    void setName() {
        PersonnelData personal=new PersonnelData("Roberto","Data Science",1999);
        personal.setName("Fernando");
        assertEquals("Fernando",personal.getName());
    }

    @Test
    void getJobtitle() {
        PersonnelData personal=new PersonnelData("Roberto","Data Science",1999);
        assertEquals("Data Science",personal.getJobtitle());
    }

    @Test
    void setJobtitle() {
        PersonnelData personal=new PersonnelData("Roberto","Data Science",1999);
        personal.setJobtitle("Arts");
        assertEquals("Arts",personal.getJobtitle());
    }

    @Test
    void getBirth() {
        PersonnelData personal=new PersonnelData("Roberto","Data Science",1999);
        assertEquals(1999,personal.getBirth());
    }


    @Test
    void setBirth() {
        PersonnelData personal=new PersonnelData("Roberto","Data Science",1999);
        personal.setBirth(2004);
        assertEquals(2004,personal.getBirth());
    }
}