package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu;


    public void loadMenuData() {
        File file = new File("coffees.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String coffee = scanner.nextLine();
                coffeeMenu.add(coffee);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
