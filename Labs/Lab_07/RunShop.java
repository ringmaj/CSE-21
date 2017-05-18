import java.util.*;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of cheese:");
		ShopArr shop = new ShopArr(input.nextInt());
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
	}

}
