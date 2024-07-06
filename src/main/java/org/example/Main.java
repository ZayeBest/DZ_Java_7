package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", "Group1", 3.7);
        Student student2 = new Student("Petr", "Tolstoy", "Group1", 5.0);
        Aspirant aspirant1 = new Aspirant("Kirill", "Sergeev", "Group2", 3.6, "SW1");
        Aspirant aspirant2 = new Aspirant("Anna", "Karpova", "Group3", 5.0, "SW2");

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (int i =0; i< students.length; i++) {
            System.out.println("Scholarship for " + students[i].firstName + " " + students[i].lastName + ": " + students[i].getScholarship() + " UAH");
        }

////////////////////////////////////////////////////////////
        System.out.println("");
        Pow powerFunction = (number, power) -> {
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= number;
            }
            return result;
        };

        int number = 2;
        int power = 3;
        int result = powerFunction.pow(number, power);
        System.out.println(number + " ^ " + power + " = " + result);

    }
}