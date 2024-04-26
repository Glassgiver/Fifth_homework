package org.example;

public class App 
{
    public static void main( String[] args ){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Boris", "Boriska", "Driver", "borisBoriska@gmail.com",
                "88083737353", 2000, 45);
        employees[1] = new Employee("Anna", "Annushka", "Manager", "annaAnnushka@gmail.com",
                "88083556589", 3000, 58);
        employees[2] = new Employee("Igor", "Igorek", "Developer", "igorIgorek@gmail.com",
                "88083454667", 4000, 32);
        employees[3] = new Employee("Olga", "Olgushka", "Accountant", "olgaOlgushka@gmail.com",
                "88083325544", 2500, 41);
        employees[4] = new Employee("Sergey", "Serega", "Designer", "sergeySerega@gmail.com",
                "88083224455", 3500, 29);

        for (Employee i: employees) {
            if(i.getAge() >= 40){
                System.out.println("\n---");
                i.showInfo();
            }
        }

    }
}
