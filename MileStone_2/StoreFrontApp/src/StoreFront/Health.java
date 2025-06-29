package StoreFront;


public class Health extends SalableProduct 
{
    private int restoreAmount;

    public Health(String name, String desc, double price, int qty, int restoreAmount) {
        super(name, desc, price, qty);
        this.restoreAmount = restoreAmount;
    }

    public int getRestoreAmount() {
        return restoreAmount;
    }

    @Override
    public String toString() {
        return super.toString() + " | Restores: " + restoreAmount + " HP";
    }
}
