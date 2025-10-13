import java.util.ArrayList;
import java.util.Scanner;

public class shopping_list {
    public static void String[] args) {
            Scanner input = new Scanner(System.in);
                    ArrayList<String> shoppingList = new ArrayList<>();

                            System.out.println("Enter up to 5 items to buy:");

                                    for (int i = 0; i < 5; i++) {
                                                System.out.print("> ");
                                                            String item = input.nextLine().trim();
                                                                        if (item.isEmpty()) {
                                                                                        break;
                                                                                                    }
                                                                                                                shoppingList.add(item);
                                                                                                                        }

                                                                                                                                System.out.println("\nYour shopping list:");
                                                                                                                                        if (!shoppingList.isEmpty()) {
                                                                                                                                                    System.out.println(String.join(", ", shoppingList));
                                                                                                                                                            } else {
                                                                                                                                                                        System.out.println("You didn't enter any items.");
                                                                                                                                                                                }

                                                                                                                                                                                        System.out.println("\nYou entered " + shoppingList.size() + " item(s).");

                                                                                                                                                                                                if (!shoppingList.isEmpty()) {
                                                                                                                                                                                                            System.out.print("\nSearch for an item: ");
                                                                                                                                                                                                                        String searchItem = input.nextLine().trim();

                                                                                                                                                                                                                                    if (shoppingList.contains(searchItem)) {
                                                                                                                                                                                                                                                    System.out.println("✅ " + searchItem + " is in your shopping list!");
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                System.out.println("❌ " + searchItem + " is not in your shopping list.");
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                System.out.println("\nNo items to search for — your list is empty.");
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                input.close();
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    }
