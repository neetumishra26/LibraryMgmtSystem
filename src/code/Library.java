package code;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Book> reservedBooks = new ArrayList<Book>();
    private ArrayList<Student> registeredStudents = new ArrayList<Student>();

    public Library(ArrayList<Book> books, ArrayList<Student> registeredStudents){
        this.books = books;
        this.registeredStudents = registeredStudents;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void addBooks(ArrayList<Book> bookList){
        for (Book book: bookList){
            this.books.add(book);
        }
    }

    public void registerMoreStudents(ArrayList<Student> studentList) {
        for (Student student: studentList){
            assignLibraryCardNumberToStudent(student);
            this.registeredStudents.add(student);
        }
    }

    private void assignLibraryCardNumberToStudent(Student student) {
        int count = this.registeredStudents.size() + 1;
        student.setLibraryCardNumber(Integer.toString(count));
    }

    public ArrayList<Student> getAllRegisteredStudents() {
        return registeredStudents;
    }

    public boolean is_registered_student(Student student) {
        for (Student regStudent: registeredStudents){
            if(regStudent.equals(student)){
                return true;
            }
        }
        return false;
    }

    public boolean reserveBook(Book book) {
        for (Book regBook: books){
            if(regBook.equals(book)){
                if(!reservedBooks.contains(book)){
                    reservedBooks.add(book);
                    return true;
                }
            }
        }
        return false;
    }

}