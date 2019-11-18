package nuigalway.app;

import java.util.ArrayList;

public class Module {

    private String modName;
    private String  modID;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<CourseProgramme> coursesAss = new ArrayList<CourseProgramme>();

    public Module(String modName, String modID, ArrayList<Student> students){
        this.modName=modName;
        this.modID=modID;
        this.students=students;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
