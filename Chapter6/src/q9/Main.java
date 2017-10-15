package q9;

import java.util.ArrayList;

import q9.Pair;

public class Main{
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("배열의 처음과 마지막 출력");
		Pair<Integer, Integer> pair =null;//=new Pair<>();
		pair = Arrays.<Integer>firstLast(arr);
		System.out.println(pair);
		System.out.println("처음값 : "+ pair.getKey());
		System.out.println("마지막 값 : "+ pair.getValue());
		
	}
}