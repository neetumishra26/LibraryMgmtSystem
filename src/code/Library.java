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

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public void addBooks(ArrayList<Book> bookList){
        for(int i=0; i<bookList.size(); i++){
            this.books.add(bookList.get(i));
        }
    }

}