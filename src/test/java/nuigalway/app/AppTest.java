package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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


}
