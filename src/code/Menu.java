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
        menuCard.add("View all available book");
        menuCard.add("Reserve book");
        menuCard.add("Add book");
        menuCard.add("Exit");
    }

    public ArrayList<String> getMenu() {
        return menuCard;
    }
}
