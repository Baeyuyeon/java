package q5;

public class Main {

	public static void main(String[] args) {
		//Double[] result = Array.swap(0, 1, 1.5,2,3);
		Double[] doubleArr = {1.5,(double) 2,(double) 3};
		Double[] result = Array.swap(doubleArr,0, 1);
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
		Double[] result2 = Array.<Double>swap(doubleArr,0, 1);
		for(int i=0; i<result2.length; i++){
			System.out.println(result2[i]);
		}
	}
}
//에러안나는데..?
