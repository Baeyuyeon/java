package q10_q11;

import java.util.ArrayList;

public class Main11 {
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("배열의 max 와 min 값 출력 ");
		Pair<Integer,Integer> pair =Arrays.minMax(arr);
		System.out.println("배열의 min 값 : "+ pair.getKey());
		System.out.println("배열의 max 값 : "+ pair.getValue());
	}
}
