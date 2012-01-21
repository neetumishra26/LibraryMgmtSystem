package test;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 9:39 AM
 * To change this template use File | Settings | File Templates.
 */

import code.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
    Book myBook;

    public BookTest() {
    }

    @Before
    public void setUp() {
        myBook = new Book("Clean code", "By Kent Back");
    }

    @Test
    public void testShouldReturnBookFullName()
    {
        Assert.assertEquals("Clean code By Kent Back", myBook.getBookFullName());
    }
}