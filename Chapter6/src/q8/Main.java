package q8;

public class Main{
	public static void main(String args[]){
		Pair<Integer, Integer> pair = new Pair<>(24,25);
		System.out.println("Pair 클래스에 접근하기");
		System.out.println("Key: "+ pair.getKey()+ " Value: "+ pair.getValue());
		System.out.println("max값 : "+ pair.max(pair));
		System.out.println("min값 : "+ pair.min(pair));
	}
}