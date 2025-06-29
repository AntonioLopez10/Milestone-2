package StoreFront;

import java.util.*;

public class InventoryManager
{
    private List<SalableProduct> products;

    public InventoryManager() {
        products = new ArrayList<>();
    }

    public void addProduct(SalableProduct item) {
        products.add(item);
    }

    public void displayInventory() {
        System.out.println("\n--- Inventory ---");
        for (int i = 0; i < products.size(); i++) {
            System.out.println("[" + i + "] " + products.get(i));
        }
    }

    public SalableProduct getProduct(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        } else {
            return null;
        }
    }
}
