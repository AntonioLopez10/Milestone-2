package StoreFront;

import java.util.Scanner;

public class StoreFront {
    private String storeName = "Campus Gear Shop";
    private InventoryManager inventory;
    private Scanner input;

    public StoreFront() {
        inventory = new InventoryManager();
        input = new Scanner(System.in);
        addSampleItems();
    }

    public void run() {
        System.out.println("Welcome to " + storeName + "!");
        int choice;
        do {
            showMenu();
            choice = getUserChoice();
            handleMenuChoice(choice);
        } while (choice != 4);
    }

    private void addSampleItems() {
        inventory.addProduct(new Weapon("Iron Sword", "Basic melee weapon", 50.0, 5, 10));
        inventory.addProduct(new Weapon("Longbow", "Great for range", 40.0, 3, 8));
        inventory.addProduct(new Armor("Chainmail", "Medium armor", 60.0, 2, 12));
        inventory.addProduct(new Armor("Leather Vest", "Light armor", 30.0, 4, 6));
        inventory.addProduct(new Health("Healing Potion", "Restores health", 15.0, 10, 25));
    }

    private void showMenu() {
        System.out.println("\nChoose an action:");
        System.out.println("1. View Inventory");
        System.out.println("2. Purchase Item");
        System.out.println("3. Cancel Purchase");
        System.out.println("4. Exit Store");
    }

    private int getUserChoice() {
        System.out.print("Enter choice: ");
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void handleMenuChoice(int choice) {
        switch (choice) {
            case 1: inventory.displayInventory();
            case 2: handlePurchase();
            case 3: handleCancel();
            case 4: System.out.println("Thanks for visiting!");
            default: System.out.println("Invalid choice. Try again.");
        }
    }

    private void handlePurchase() {
        inventory.displayInventory();
        System.out.print("Enter item number to buy: ");
        try {
            int index = Integer.parseInt(input.nextLine());
            SalableProduct item = inventory.getProduct(index);
            if (item != null) {
                item.purchase();
            } else {
                System.out.println("Invalid item.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    private void handleCancel() {
        inventory.displayInventory();
        System.out.print("Enter item number to cancel: ");
        try {
            int index = Integer.parseInt(input.nextLine());
            SalableProduct item = inventory.getProduct(index);
            if (item != null) {
                item.cancelPurchase();
            } else {
                System.out.println("Invalid item.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    public static void main(String[] args) {
        new StoreFront().run();
    }
}
