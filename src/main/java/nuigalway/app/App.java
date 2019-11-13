package nuigalway.app;


import org.joda.time.DateTime;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        Student stud1 = new Student("Conor",1,"06/06/2018");
        Student stud2 = new Student("Connor",2,"06/06/2017");
        Student stud3 = new Student("Corner",3,"06/06/2016");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);

        Module mod1 = new Module("programming", "CT404", students);
        ArrayList<Module> modules = new ArrayList<Module>();
        modules.add(mod1);

        DateTime date1 = new DateTime("2019-08-01T12:00:00.000+08:00");
        DateTime date2 = new DateTime("2020-05-01T12:00:00.000+08:00");

        CourseProgramme programme = new CourseProgramme("Compsci", students,modules,date1,date2);


    }
}
