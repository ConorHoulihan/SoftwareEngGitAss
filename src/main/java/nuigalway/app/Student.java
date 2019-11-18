package nuigalway.app;

import java.util.ArrayList;

public class Student {
private String name;
private int age;
private String DOB;
private ArrayList<String> courses = new ArrayList<String>();
private ArrayList<String> modulesReg = new ArrayList<String>();

    public Student(String name, int age, String DOB){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
    }

    public String getUsername(){
        String nameAge = name + age;
        return nameAge;
    }
}
