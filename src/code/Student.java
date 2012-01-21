package code;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String libraryCardNumber;
    private boolean isAdmin;

    public Student(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
        this.libraryCardNumber = "";
        this.isAdmin = false;
    }

    public Student(String fname, String lname, boolean isAdmin) {
        this.firstName = fname;
        this.lastName = lname;
        this.libraryCardNumber = "";
        this.isAdmin = isAdmin;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }


    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public boolean isLibraryNotCardAssigned(){
        return libraryCardNumber.equals("");
    }


    public boolean isAdminRights() {
        return isAdmin;
    }
}
