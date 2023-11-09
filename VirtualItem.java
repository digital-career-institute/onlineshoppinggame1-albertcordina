public class VirtualItem {
	
	private int itemID;
	private String name;
	private double price;
	private int points;

	public VirtualItem(int itemID, String name, double price, int points) {
		this.itemID = itemID;
		this.name = name;
		this.price = price;
		this.points = points;
	}

	public int getItemID() {
		return itemID;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return "ID: " + itemID + ", Name: " + name + ", Price: $" + price + ", Points: " + points;
	}
}
