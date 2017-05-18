import java.util.Scanner;
import java.util.Arrays;

public class RemainderFunc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
System.out.println("Please enter the max number: ");
int maxNum= input.nextInt();

System.out.println("Please enter the divisor: ");
int divisor= input.nextInt();

int start =1;

while(start <=maxNum){
	System.out.println("Num "+ start+ " % "+ divisor+" = "+(start%divisor));
	start++;
}
	}

}
