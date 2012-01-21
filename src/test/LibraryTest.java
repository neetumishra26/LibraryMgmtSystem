import code.Book;
import code.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 12:16 PM
 * To change this template use File | Settings | File Templates.
 */

public class LibraryTest {
    ArrayList<Book> books = new ArrayList<Book>();
    Library myLibrary;

    public LibraryTest(){}

    @Before
    public void setUp() {
        books.add(new Book("Clean code vol1", "Kent Back"));
        books.add(new Book("Clean code vol2", "Kent Back"));
        myLibrary = new Library(books);
    }

    @Test
    public void testShouldReturnAllBooksInLibrary(){
        Assert.assertEquals(books, myLibrary.getAllBooks());
        Assert.assertEquals(2, myLibrary.getAllBooks().size());
    }

    @Test
    public void testShouldAddBooks(){
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Clean code vol3", "Kent Back"));
        bookList.add(new Book("Clean code vol4", "Kent Back"));
        myLibrary.addBooks(bookList);
        Assert.assertEquals(4, myLibrary.getAllBooks().size());
    }
}
