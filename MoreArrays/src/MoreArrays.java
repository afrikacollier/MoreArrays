public class MoreArrays {


	public static int[] toPower(int size, int power){
		int[] anArray = new int[size];
		for(int i = 0; i < size; ++i){
			anArray[i] = (int) Math.pow(i, power);
		} 
		return anArray;
	}

	public static void sumArray(int[] sumAnArray){
		for(int item : sumAnArray){
			System.out.println(item);
		}
		return;
	} 

	public static void main(String[] args){
			int[] anArray = toPower(4,3);
			for(int item: anArray) {
				System.out.println(item);
				System.out.println(item += item);
			}
	}

}
