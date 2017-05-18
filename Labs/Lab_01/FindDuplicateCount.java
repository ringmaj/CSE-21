
import java.util.ArrayList;
import java.util.Arrays;
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		
		// Fill-in
		int numOccur=0;
		
		
		
		
		

		int index=0;
		
		ArrayList<Integer> indexList = new ArrayList<>();
		
		for( int value = 1; value<6; value++){
			
		
		for( int i=0; i<12; i++){
			
			if(arr[i]==value){
				
				indexList.add(i);
				numOccur++;
				
			}
		}	
		int x=0;
		while(numOccur>0){
			
		if (numOccur>0){
			System.out.println("There are "+numOccur+" more occurrences of value "+value+" starting at index "+indexList.get(x));
		}
		else{
			System.out.println("There is only "+numOccur+" more occurrence of value "+value+" starting at index "+indexList.get(0));
		}
		numOccur--;
		x++;
		}
	

	System.out.println("There are "+numOccur+" more occurrences of value "+value+" starting at index "+indexList.get(0));
	
			
	System.out.println("No duplicates with value "+value+" beyond index "+indexList.get(indexList.size()-1));	
		
	
			
			numOccur=0;
			indexList.clear();
			
		}	
		

		
		}
	
	}



