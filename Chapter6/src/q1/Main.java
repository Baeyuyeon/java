package q1;

public class Main {

	public static void main(String args[]){
		
		Stack<Integer> stack = new Stack<>();
		System.out.println("1~10 까지 push");
		for(int i=1; i<=10; i++){
		
			stack.push(i);
		}
		System.out.println("pop() 실행");
		for(int i=0; i<10;i++){
			int a=stack.pop();
			System.out.println("pop 값 : "+ a);
		}
		System.out.println("값이 없는지?");
		stack.isEmpty();
	}
	
}
