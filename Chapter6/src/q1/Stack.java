package q1;

import java.util.ArrayList;

public class Stack<E> {
	private E e;
	//private int top=-1;// 초기화
	//private final int size = 10; //10으로 size 초기화

	private ArrayList<E> arrayE= new ArrayList<>();

	public void push(E e){ //stack 에 집어넣음
		
		arrayE.add(e);
	}
	public E pop(){
		int size =arrayE.size();
	
		E popVal = arrayE.get(size-1);
		arrayE.remove(size-1);
		return popVal;
	}
	public void isEmpty(){
		int size =arrayE.size();
		if(size ==0){
			throw new EmptyStackException();
		}
	}

}

class EmptyStackException extends RuntimeException {
	  public EmptyStackException() {
	    this("Stack is empty");
	  }

	  public EmptyStackException(String exception) {
	    super(exception);
	  }
	}

