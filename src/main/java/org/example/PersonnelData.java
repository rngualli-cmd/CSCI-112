package org.example;

public class PersonnelData {


    private String name;
    private String jobtitle;
    private int birth;


    public PersonnelData(String name, String jobtitle, int birth) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.birth = birth;
    }

    // 3. Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}