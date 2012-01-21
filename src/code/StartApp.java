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
    }

    private static void showFormattedMenu(ArrayList<String> menuList) {
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println("Enter " + (i+1) + " to " + menuList.get(i));
        }
    }
}
