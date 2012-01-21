package code;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 9:41 AM
 * To change this template use File | Settings | File Templates.
 */

public class Book {

    private String name;
    private String author;

    public Book(){}

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getBookFullName(){
        return full_name();
    }

    private String full_name(){
        return this.name + " by " + this.author;
    }

}
