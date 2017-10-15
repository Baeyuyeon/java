package q6;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]){
		ArrayList<Integer> arr1= new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		//ArrayList<?> arr2 = new ArrayList<>();
		copy(arr1);
		copy2(arr1);
		
	}
	public static void copy(ArrayList<? extends Integer> arr){
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int i=0; i< arr.size(); i++)
		{
			arr2.add(arr.get(i));
			
		}
		
		System.out.println("copy 한 값 :");
		for(int i=0; i< arr2.size(); i++)
		{
			System.out.print(arr2.get(i));
			
		}
		
		
	}
	public static void copy2(ArrayList<? super Integer> arr){
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int i=0; i< arr.size(); i++)
		{
			arr2.add((Integer) arr.get(i));
			
		}
		
		System.out.println("copy 한 값 :");
		for(int i=0; i< arr2.size(); i++)
		{
			System.out.print(arr2.get(i));
			
		}
		
		
	}
}
