package nuigalway.app;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;

import java.util.ArrayList;
public class CourseProgramme {

    private String courseName;
    private ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Module> modules = new ArrayList<Module>();
    DateTime startDate;
    DateTime endDate;

    public CourseProgramme(String courseName, ArrayList<Student> students, ArrayList<Module> modules,DateTime startDate, DateTime endDate){
            this.courseName=courseName;
            this.students=students;
            this.modules=modules;
            this.startDate=startDate;
            this.endDate=endDate;
    }

    public ArrayList<Module> getModules(){
        return modules;
    }
}
