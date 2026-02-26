package org.example;

public class Consultans {

    public static final int year_2026 = 2026;
    private PersonnelData[] personnelList;
    private int count;
    private String Ciel;


    public Consultans(String Ciel) {
        this.Ciel = Ciel;
        this.personnelList = new PersonnelData[40];
        this.count = 0;


    }

    public void addPersonnelData(PersonnelData data) {
        this.personnelList[count] = data;
        count++;


    }

    public double getAverage() {
        double Total = 0;

        for (int i = 0; i < count; i++) {
            int age = 2026 - personnelList[i].getBirth();
            Total += age;


        }
        return Total / count;
    }

    public PersonnelData getOldest() {
        PersonnelData old = personnelList[0];

        for (int i = 0; i < count; i++) {
            if (personnelList[i].getBirth() < old.getBirth()) {
                old = personnelList[i];
            }


        }
        return old;


    }
    public PersonnelData getYoungest() {
        PersonnelData young = personnelList[0];

        for (int i = 0; i < count; i++) {
            if (personnelList[i].getBirth() > young.getBirth()) {
                young = personnelList[i];


            }
        }
        return young;

        }

        public String getCiel(){return Ciel;}
    public int getCount(){return count;}
    public PersonnelData[] getPersonnelList(){return personnelList;}


}
