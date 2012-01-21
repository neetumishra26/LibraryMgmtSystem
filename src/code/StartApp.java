package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class StartApp {
    public static Library library;

    public static void main(String[] args) throws IOException{
        createLibrary();

        Menu menu = new Menu();
        ArrayList<String> menuList = menu.getMenu();
        showFormattedMenu(menuList);

        performMenuSelection();


    }

    private static void createLibrary() {
        ArrayList<Book> books = new ArrayList<Book>();
        initializeBooks(books);
        ArrayList<Student> registeredStudents = new ArrayList<Student>();
        initializeStudents(registeredStudents);
        library = new Library(books,registeredStudents);
    }

    private static void performMenuSelection() {
        int menuSelection = getSelectionFromUser();
        if (menuSelection == 1)
            printBookCatalog();
//        else if (menuSelection == 2)
//            reserveBook();
//        else if (menuSelection == 3)
//            addBook();
        else if (menuSelection == 4)
            System.exit(0);
        else
        System.out.println("Enter a valid integer!!");
    }

    private static void printBookCatalog() {
        for (Book book:library.getAllBooks()){
            System.out.println(book.getBookFullName());
        }
    }

    private static int getSelectionFromUser() {
        String input = null ;
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine() ;
            return Integer.parseInt(input);
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return 0;
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
        System.out.println("Enter your choice : ");
    }
}
