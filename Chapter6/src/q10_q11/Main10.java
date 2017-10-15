package q10_q11;

import java.util.ArrayList;

import q10_q11.Pair;

public class Main10{
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("배열의 max 와 min 값 출력 ");
		int max = 0;
		int min =0;
		max = Arrays.<Integer>maxValue(arr);
		min = Arrays.<Integer>minValue(arr);
		System.out.println("배열의 max 값 : "+ max);
		System.out.println("배열의 min 값 : "+ min);
		
	}
}