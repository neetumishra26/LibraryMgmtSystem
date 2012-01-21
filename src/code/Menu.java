package code;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: neetu
 * Date: 21/1/12
 * Time: 10:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    private ArrayList<String> menuCard = new ArrayList<String>();

    public Menu(){
        menuCard.add("Press 1 to View all available book");
        menuCard.add("Press 2 to Reserve book");
        menuCard.add("Press 3 to Add book");
        menuCard.add("Press 0 to Exit");
    }

    public ArrayList<String> getMenu() {
        return menuCard;
    }
}
