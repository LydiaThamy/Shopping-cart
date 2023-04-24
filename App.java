package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to your shopping cart");
        System.out.println("Please type a command. You may type 'help' if you need a list of commands.");

        String input = "";
        List<String> shoppingList = new ArrayList<>();

        Console con = System.console();

        while (!input.equals("done")) {
            input = con.readLine();

            if (input.equals("help")) {
                System.out.println("Type 'list' to see a list of items in your shopping cart");
                System.out.println("Type 'add (name of item, etc...)' to add items into your shopping cart");
                System.out.println("Type 'delete (index of item)' to delete an item in your shopping cart");
                System.out.println("Type 'done' to finish editing your shopping cart");
            }

            if (input.equals("list")) {
                if (shoppingList.isEmpty()) {
                    System.out.println("Your cart is empty");
                } else {
                    for (int i = 0; i <= shoppingList.size(); i++) {
                        System.out.println((i + 1) + ". " + shoppingList.get(i));
                    }
                }
            }

        }

        System.out.println("Your shopping list is complete. Bye bye!");

    }
}
