import code.Menu;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 10:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {
    Menu myMenu;

    @Before
    public void setUp()
    {
        myMenu = new Menu();
    }

    @Test
    public void testShouldReturnMenu(){
        Assert.assertNotNull(myMenu.getMenu());
    }

    @Test
    public void testMenuShouldContainOptionToViewAllBook(){
        Assert.assertEquals("View all available book",myMenu.getMenu().get(0));
    }

    @Test
    public void testMenuShouldContainOptionToReserveBook(){
        Assert.assertEquals("Reserve book",myMenu.getMenu().get(1));
    }

    @Test
    public void testMenuShouldContainOptionToAddBook(){
        Assert.assertEquals("Add book",myMenu.getMenu().get(2));
    }

    @Test
    public void testMenuShouldContainOptionToExit(){
        Assert.assertEquals("Exit",myMenu.getMenu().get(3));
    }

}
