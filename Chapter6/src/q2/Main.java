package q2;

import q2.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		System.out.println("1~12까지 push");
		for(int i=1; i<=10; i++){
			stack.push(i, i);
		}
		System.out.println("pop() 실행");
		for(int i=1; i<=10; i++){
			int e =stack.ePop();
			int o = (int) stack.objPop();
			System.out.println("E 배열 요소 : "+e+", Obj 배열 요소 : "+o);
		}
		System.out.println("값이 없는지?");
		stack.isEmptyE();
		stack.isEmptyObj();
	}
/*모르겠어요..*/
}
