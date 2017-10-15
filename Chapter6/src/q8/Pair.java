package q8;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
    
    public static <T extends Integer> Integer max(Pair<T,T> p){
    	if(p.getKey()> p.getValue()){
    		return (Integer)p.getKey();
    	}
    	else
    		return (Integer)p.getValue();
    
    	
    }
    public static <T extends Integer> Integer min(Pair<T,T> p){
    	if(p.getKey()< p.getValue()){
    		return (Integer)p.getKey();
    	}
    	else
    		return (Integer)p.getValue();
    
    	
    }
}
