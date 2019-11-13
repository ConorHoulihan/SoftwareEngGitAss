public class Student {
private String name;
private int age;
private String DOB;
private String courses;
private String modulesReg;

    public Student(){

    }

    public String getUsername(){
        return name+age;
    }
}

//Name, Age, DOB,
//ID, username, courses and modules registered
//(getUsername()) will generate the Student’s username by concatenating
//their name and age.