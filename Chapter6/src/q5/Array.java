package q5;

public class Array {
	public static<T> T[] swap(T[] array, int i, int j){
		T temp = array[i];
		array[i] =array[j];
		array[i]= temp;
		return array;
	}
}
