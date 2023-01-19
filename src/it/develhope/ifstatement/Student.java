package it.develhope.ifstatement;
import java.util.Random;
public class Student {
    private String name;
    private int age;

    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge(){
        Random random = new Random(age);
        int random_integer = random.nextInt(35);
    }
}
