package q9;

import java.util.ArrayList;

public class Arrays {
	public static <E> Pair<E, E> firstLast(ArrayList<E> a){
		System.out.println(a);
    	Pair<E, E> pair = new Pair<>() ;
    	System.out.println(a.get(0));
    	System.out.println(a.get(a.size()-1));
    	
    	pair.setKey(a.get(0));
    	pair.setValue(a.get(a.size()-1));
    
    	return pair;
    	
    	
    }
}
