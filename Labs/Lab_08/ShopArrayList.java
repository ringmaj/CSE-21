import java.util.*;

public class ShopArrayList {

	// Instance Variables
	private ArrayList<Cheese> cheese = new ArrayList<Cheese>();
	
	// Initialize method
	private void init(int max) {

		if (max > 0) {
			cheese.add(new Cheese("Dalaran Sharp", 1.25));
		}
		if (max > 1) {
			cheese.add(new Cheese("Stormwind Brie", 10.00));
		}
		if (max > 2) {
			cheese.add(new Cheese("Alterac Swiss", 40.00));
			//cheese[2].setName("Wrong Name");
		}
		
		Random ranGen = new Random(100);

		for (int i = 3; i < max; i++) {
			cheese.add(new Cheese());
			cheese.get(i).setName("Cheese type" + (char)('A'+i));
			cheese.get(i).setPrice(ranGen.nextInt(1000)/100.0);
			
			// Fill-in Code
		}
		
	}
	public ShopArrayList() {
		init(10);
	}
	
	public ShopArrayList(int max) {
		// Fill-in Code
		init(max);
	}

	private void intro(Scanner input) {
		System.out.println("We sell " + cheese.size() + " types of Cheese");
		
		// Fill-in Code
		
		for (int i = 0; i < cheese.size(); i++)
			System.out.println(cheese.get(i).getName() + ": $ " + cheese.get(i).getPrice() + " per pound");
		for (int j = 0; j < cheese.size(); j++)
		{
			System.out.println("Enter the amount of " + cheese.get(j).getName() + " : ");
			cheese.get(j).setAmount(input.nextInt());		} 
	}

	private double calcSubTotal() {
		double amount = 0;
		// Fill-in Code
		for (int i = 0; i < cheese.size(); i++)
			amount += cheese.get(i).getPrice();
		return amount;
	}

	private double discount(double sub) {
		return ((sub > 100)? 25 : (sub > 50)? 10: 0);
	}

	private void itemizedList(){
		int amt;
		System.out.println();
		// Fill-in Code
		for(int i = 0; i< cheese.size(); i++){
			amt = cheese.get(i).getAmount();
			System.out.println(amt + " lbs of " + cheese.get(i).getName() + " @ $" + cheese.get(i).getPrice() + " = " + (amt * cheese.get(i).getPrice()));
		}
	}

	private void printTotal(double sub, double disc) {
		System.out.println();
		System.out.println("Sub Total  : $" + sub);
		System.out.println("- Discount : $"+ disc);
		System.out.println("Total Price: $" + (sub - disc));
	}

	private void printFree(){
		int amt;
		System.out.println();
		System.out.println("Today is your lucky day!");
		for (int i = 0; i < cheese.size(); i++) 		
			if ((amt = cheese.get(i).getAmount()) > 0)
				System.out.println(amt + " lbs of " + cheese.get(i).getName() + " @ $0 = " + 0);
		System.out.println("Total Price: FREE");
	}

	public void run() {

		Scanner input = new Scanner(System.in);
		intro(input);
		double sub = calcSubTotal();
		double disAmt = discount(sub);

		System.out.println();
		System.out.print("Do you want to see the itemized list? (1 for yes): ");
		int list = input.nextInt();
		if (list == 1)
			itemizedList();	

		int free = (new Random()).nextInt(100);
		//System.out.println("Random num is "+ free);
		if (free != 0)
			printTotal(sub, disAmt);
		else {
			printFree();
			return ;
		}

		System.out.println();
		System.out.print("Do you wish to redo your whole order? (1 for yes): ");
		int redo = input.nextInt();

		System.out.println();

		if (redo == 1)
			run();
		else
			System.out.println("Thanks for coming!");
	}
}
