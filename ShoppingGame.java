import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingGame {
	
	public static void main(String[] args) {
		
		ArrayList<VirtualItem> cart = new ArrayList<>();
		int playerPoints = 100;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("Available Items:\n1. Power-Up (Double Points) - $10\n2. Power-Up (Extra Life) - $15"
					+ "\n3. Decoration (Space Theme) - $5\n4. Decoration (Fantasy Theme) - $7\n5. Display Cart\n6. Quit\nEnter your choice: ");
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				if (playerPoints >= 10) {
					cart.add(new PowerUp(cart.size() + 1, "Double Points Power-Up", 10, 20, "Double Points"));
					playerPoints -= 10;
				} else {
					System.out.println("Insufficient points!");
				}
				break;
			case 2:
				if (playerPoints >= 15) {
					cart.add(new PowerUp(cart.size() + 1, "Extra Life Power-Up", 15, 30, "Extra Life"));
					playerPoints -= 15;
				} else {
					System.out.println("Insufficient points!");
				}
				break;
			case 3:
				if (playerPoints >= 5) {
					cart.add(new Decoration(cart.size() + 1, "Space Theme Decoration", 5, 10, "Space"));
					playerPoints -= 5;
				} else {
					System.out.println("Insufficient points!");
				}
				break;
			case 4:
				if (playerPoints >= 7) {
					cart.add(new Decoration(cart.size() + 1, "Fantasy Theme Decoration", 7, 15, "Fantasy"));
					playerPoints -= 7;
				} else {
					System.out.println("Insufficient points!");
				}
				break;
			case 5:
				System.out.println("Your Cart:");
				for (VirtualItem item : cart) {
					System.out.println(item);
				}
				System.out.println("Total Points in Cart: " + calculateTotalPoints(cart));
				System.out.println("Remaining Points: " + playerPoints);
				break;
			case 6:
				System.out.println("Thank you for playing!");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
      scanner.close();
		}
	}

	private static int calculateTotalPoints(ArrayList<VirtualItem> cart) {
		int totalPoints = 0;
		for (VirtualItem item : cart) {
			totalPoints += item.getPoints();
		}
		return totalPoints;
	}
}
