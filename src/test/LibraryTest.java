import code.Book;
import code.Library;
import code.Student;
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
    ArrayList<Student> registeredStudents = new ArrayList<Student>();

    Library myLibrary;

    public LibraryTest(){}

    @Before
    public void setUp() {
        books.add(new Book("Clean code vol1", "Kent Back"));
        books.add(new Book("Clean code vol2", "Kent Back"));
        myLibrary = new Library(books, registeredStudents);
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

    @Test
    public void test_Should_Register_Students_In_Library_And_assign_them_lib_card_number(){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Neetu","Mishra"));

        myLibrary.registerMoreStudents(students);

        Assert.assertEquals(1, myLibrary.getAllRegisteredStudents().size());
        Student student_with_new_library_card = myLibrary.getAllRegisteredStudents().get(0);
        Assert.assertEquals("1", student_with_new_library_card.getLibraryCardNumber());
    }

    @Test
    public void testShouldReturnTrueIfStudentIsRegisteredElseFalse(){
        ArrayList<Student> students = new ArrayList<Student>();
        Student student = new Student("Neetu", "Mishra");
        Assert.assertFalse(myLibrary.is_registered_student(student));

        students.add(student);
        myLibrary.registerMoreStudents(students);

        Assert.assertTrue(myLibrary.is_registered_student(student));
    }

    @Test
    public void testShouldReserveExistingBookOnly(){
        Book existing_book = myLibrary.getAllBooks().get(0);
        Book non_existing_book = new Book("ABC", "Kent Back");
        Assert.assertTrue(myLibrary.reserveBook(existing_book));
        Assert.assertFalse(myLibrary.reserveBook(non_existing_book));
    }

    @Test
    public void testShouldReserveBookOnlyOnce(){
        Book existing_book = myLibrary.getAllBooks().get(0);
        Assert.assertTrue(myLibrary.reserveBook(existing_book));
        Assert.assertFalse(myLibrary.reserveBook(existing_book));
    }

}
