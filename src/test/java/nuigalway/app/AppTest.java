package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void CheckgetUserName()
    {
        Student stud1 = new Student("Conor",1,"06/06/2018");
        assertEquals( stud1.getUsername(),"Conor1" );
    }
}
