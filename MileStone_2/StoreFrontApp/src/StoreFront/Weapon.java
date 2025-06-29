package StoreFront;

public class Weapon extends SalableProduct
{
	private int damage;
	
	public Weapon(String name, String desc, double price, int qty, int damage)
	{
		super(name, desc, price, qty);
		this.damage = damage;
	}
	
	public int getDamage()
	{
		return damage;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " | Damage: " + damage;
	}
}
