import java.util.*;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Cheese");
		int ans = input.nextInt();
		if (ans < 0)
			System.out.println("Please do not enter negative numbers");
		else 
		{
			ShopArrayList shop = new ShopArrayList(ans);
			shop.run();
		}
		
		
	}

}


