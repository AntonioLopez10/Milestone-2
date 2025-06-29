package StoreFront;

public abstract class SalableProduct 
{
	protected String name;
	protected String description;
	protected double price;
	protected int quantity;
	
	public SalableProduct(String name, String description, double price, int quantity)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void purchase()
	{
		if (quantity > 0)
		{
			quantity--;
            System.out.println("You bought: " + name);
        } else {
            System.out.println(name + " is out of stock.");
        }
    }

    public void cancelPurchase() {
        quantity++;
        System.out.println("Purchase canceled: " + name);
    }

    public String toString() {
        return name + " - " + description + " | $" + price + " | Qty: " + quantity;
    }

		
}

