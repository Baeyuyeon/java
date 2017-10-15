package q2;

public class Stack<E> {
	//private final int size=0;
	private int topE=0;
	private int topObj=0;
	private E[] eArr =(E[])new Object[10];
	private Object[] objArr= new Object[10];
	
	public void push(E e, Object obj){
		if(eArr.length >10){ //배열이 꽉차면 크기를 늘려줌.
			int size = eArr.length;
			E[] tempE =(E[])new Object[size++];
			for(int i=0; i<size; i++){
				tempE[i] = eArr[i];
			}
			eArr =tempE;
			
			
		}
		if(objArr.length>10){ //배열이 꽉차면 크기를 늘려줌.
			int size = objArr.length;
			Object[] tempO =new Object[size++];
			for(int i=0; i<size; i++){
				tempO[i] = objArr[i];
			}
			objArr =tempO;
		}
		
		eArr[topE] = e;
		objArr[topObj] =obj;
		topE++;
		topObj++;
		
	}
	public E ePop(){
		if(topE ==-1){
			 throw new EmptyStackException("Stack is empty");
		}
		return eArr[topE--];

	}
	public Object objPop(){
		if(topE ==-1){
			 throw new EmptyStackException("Stack is empty");
		}
		return objArr[topObj--];

	}
	
	public void isEmptyE(){
		int size =eArr.length;
		if(size ==0){
			throw new EmptyStackException();
		}
	}
	public void isEmptyObj(){
		int size =eArr.length;
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