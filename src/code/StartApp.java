package code;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class StartApp {
    public static void main(String[] args) throws IOException{
        Menu menu = new Menu();
        ArrayList<String> menuList = menu.getMenu();
        showFormattedMenu(menuList);

        ArrayList<Book> books = new ArrayList<Book>();
        initializeBooks(books);

        ArrayList<Student> registeredStudents = new ArrayList<Student>();
        initializeStudents(registeredStudents);

        Library library = new Library(books,registeredStudents);

    }

    private static void initializeStudents(ArrayList<Student> registeredStudents) {
        registeredStudents.add(new Student("Neetu","Neetu"));
        registeredStudents.add(new Student("Mishra","Mishra"));
    }

    private static void initializeBooks(ArrayList<Book> books) {
        books.add(new Book("Clean code","Kent back"));
        books.add(new Book("Couchdb","Chris Anderson"));
        books.add(new Book("Django:web development","Adrian Holovaty"));
        books.add(new Book("Python","Mark Pilgrim"));
    }

    private static void showFormattedMenu(ArrayList<String> menuList) {
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println("Enter " + (i+1) + " to " + menuList.get(i));
        }
    }
}
