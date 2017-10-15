package q10_q11;

import java.util.ArrayList;

public class Arrays {
	public static <E> Pair<E, E> firstLast(ArrayList<E> a){
		
    	Pair<E, E> pair = new Pair<>() ;
    	pair.setKey(a.get(0));
    	pair.setValue(a.get(a.size()-1));
    
    	return pair;
    	
    	
    }
	public static <E extends Number> E maxValue(ArrayList<E> a){
	
    	Pair<E, E> pair = new Pair<>();	
    	E max = a.get(0);
    	for(int i=0; i<a.size(); i++){
    		if((Integer)a.get(i)> (Integer)max){
    			max = a.get(i);
    		}
    	}
    	
    	
    
    	return max;
    	
    	
    }
	public static <E extends Number> E minValue(ArrayList<E> a){
		

    	Pair<E, E> pair = new Pair<>();	
    	E min = a.get(0);
    	for(int i=0; i<a.size(); i++){
    		if((Integer)a.get(i)< (Integer)min){
    			min = a.get(i);
    		}
    	}
    	
    	
    
    	return min;
    	
    }
	public static <E> Pair<E, E> minMax(ArrayList<E> a){
		
    	Pair<E, E> pair = new Pair<>() ;
    	E max = a.get(0);
    	for(int i=0; i<a.size(); i++){
    		if((Integer)a.get(i)> (Integer)max){
    			max = a.get(i);
    		}
    	}
    	E min = a.get(0);
    	for(int i=0; i<a.size(); i++){
    		if((Integer)a.get(i)< (Integer)min){
    			min = a.get(i);
    		}
    	}
    	pair.setKey(min);
    	pair.setValue(max);
    
    	return pair;
    	
    	
    }
}
