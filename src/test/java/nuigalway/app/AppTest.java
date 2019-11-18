package nuigalway.app;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.joda.time.DateTime;

import org.junit.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void CheckGetUserName()
    {
        Student stud1 = new Student("Conor",1,"06/06/2018");
        assertEquals( stud1.getUsername(),"Conor1" );
    }
    @Test
    public void CheckStudentsInModule(){
        Student stud1 = new Student("Conor",1,"06/06/2018");
        ArrayList<Student> students= new ArrayList<Student>();
        students.add(stud1);
        Module mod1 = new Module("computer","CT404", students);
        assertEquals( mod1.getStudents().get(0).getUsername(),"Conor1" );
    }
    @Test
    public void CheckStudentsInCourse(){
        Student stud1 = new Student("Conor",1,"06/06/2018");
        ArrayList<Student> students= new ArrayList<Student>();
        students.add(stud1);
        Module mod1 = new Module("computer","CT404", students);
        ArrayList<Module> modules= new ArrayList<Module>();
        modules.add(mod1);
        DateTime date1 = new DateTime("2019-08-01T12:00:00.000+08:00");
        DateTime date2 = new DateTime("2020-05-01T12:00:00.000+08:00");
        CourseProgramme course1 = new CourseProgramme("CS&IT", students, modules, date1,date2);
        assertEquals( course1.getModules().get(0).getStudents().get(0).getUsername(),"Conor1" );
    }



}
