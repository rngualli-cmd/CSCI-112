package org.example;



public class P1Driver {
    public static void main(String[] args) {


        Consultans MyComp = new Consultans("Ciel Consulting");

        MyComp.addPersonnelData(new PersonnelData("Tyree Dach", "Accountability Supervisor", 1983));
        MyComp.addPersonnelData(new PersonnelData("Deangelo Klocko", "Communications Strategist", 1990));
        MyComp.addPersonnelData(new PersonnelData("Jackeline Bradtke", "Optimization Associate ", 1988));
        MyComp.addPersonnelData(new PersonnelData("Lurline Huels", "Response Agent ", 1996));
        MyComp.addPersonnelData(new PersonnelData("Joaquin Boyer", "Intranet Analyst", 1982));
        MyComp.addPersonnelData(new PersonnelData("Dejuan Schumm DDS", "Research Designer", 1995));
        MyComp.addPersonnelData(new PersonnelData("Bethany Collier", "Program Analyst", 1972));
        MyComp.addPersonnelData(new PersonnelData("Ransom Ruecker V", "Applications Officer", 1986));
        MyComp.addPersonnelData(new PersonnelData("Adrianna Romaguera Jr.", "Branding Specialist", 1967));
        MyComp.addPersonnelData(new PersonnelData("Curtis Greenfelder", "Creative Strategist", 1979));
        MyComp.addPersonnelData(new PersonnelData("Mrs. Brenna Bergnaum", "Applications Developer", 1994));
        MyComp.addPersonnelData(new PersonnelData("Hunter Beier DVM", "Marketing Orchestrator", 1978));

        PersonnelData[] list = MyComp.getPersonnelList();
        for (int i = 0; i < MyComp.getCount(); i++) {
        PersonnelData nowperson = list[i];
        int age = 2026 - nowperson.getBirth();
        System.out.println(nowperson.getName() + " is: " + age + " years old.");





        }
        System.out.println("Average age in Ciel : "+ MyComp.getAverage());
        System.out.println("Youngest in the business : "+MyComp.getYoungest().getName() + " with "+(2026-MyComp.getYoungest().getBirth())+" years old");
        System.out.println("Oldest in the business : "+MyComp.getOldest().getName()+ " with "+(2026-MyComp.getOldest().getBirth())+" years old");

    }










    }




