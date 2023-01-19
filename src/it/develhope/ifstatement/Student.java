package it.develhope.ifstatement;
import java.util.Random;
public class Student {
    private String name;
    private int age;

    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge(int rando){
        Random random = new Random(rando);
        int random_integer = random.nextInt(35);
        System.out.printf("I generated the random number %d for student %s", rando, name);

        if(rando == age){
            System.out.println("The random number is equal to the student's age");
        }else if(rando > age){
            System.out.println("The random number is greater than the student's age");
        }else{
            System.out.println("The random number is lower than the student's age");
        }
    }
}
