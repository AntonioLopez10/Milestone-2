package StoreFront;

public class Armor extends SalableProduct
{
	private int defense;
	
	public Armor(String name, String desc, double price, int qty, int defense)
	{
		super(name, desc, price, qty);
		this.defense = defense;
	}
	
	 public int getDefense() {
	        return defense;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + " | Defense: " + defense;
	    }
}
