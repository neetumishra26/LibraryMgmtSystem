import code.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class StudentTest {
    Student student;
    Student adminStudent;

    @Before
    public void setUp()
    {
        student = new Student("Neetu","Mishra");
        adminStudent = new Student("abc","xyz", true);
    }

    @Test
    public void testShouldReturnFullName(){
        Assert.assertEquals("Neetu Mishra", student.getFullName());
    }

    @Test
    public void testShouldCheckForLibraryCard(){
        Assert.assertTrue(student.isLibraryCardNotAssigned());
        student.setLibraryCardNumber("123");
        Assert.assertFalse(student.isLibraryCardNotAssigned());
        Assert.assertEquals("123", student.getLibraryCardNumber());
    }

    @Test
    public void testShouldCheckForAdminRights(){
        Assert.assertTrue(adminStudent.isAdminRights());
        Assert.assertFalse(student.isAdminRights());
    }

}
