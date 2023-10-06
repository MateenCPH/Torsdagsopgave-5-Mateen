package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cafe cafeOne = new Cafe();
        cafeOne.loadMenuData();
        displayMenu(cafeOne);
    }

    /*public static void displayMenu(Cafe cafeOne) {
        for (int i = 0; i < cafeOne.getCoffeeMenu().size(); i++) ;
        {
            int i = 0;
            String coffee = cafeOne.getCoffeeMenu().get(i);
            System.out.println(coffee);
        }
    }*/

    public static void displayMenu(Cafe cafeOne) {
        for (String menuItem : cafeOne.getCoffeeMenu()) {
            System.out.println(menuItem);
        }
    }

}

