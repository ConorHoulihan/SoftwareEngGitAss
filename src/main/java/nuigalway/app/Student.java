import java.util.ArrayList;

public class Student {
private String name;
private int age;
private String DOB;
private ArrayList<String> courses = new ArrayList<String>();
private ArrayList<String> modulesReg = new ArrayList<String>();

    public Student(String name, int age, String DOB,ArrayList<String> courses,ArrayList<String> modulesReg){

    }

    public String getUsername(){
        return name+age;
    }
}
