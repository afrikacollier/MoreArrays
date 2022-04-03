public class MoreArrays {


	public static int[] toPower(int size, int power){
		int[] anArray = new int[size];
		for(int i = 0; i < size; ++i){
			anArray[i] = (int) Math.pow(i, power);
		} 
		return anArray;
	}

	public static int sumArray(int[] sumAnArray){
		int sum = 0;
		for(int item: sumAnArray) {
			System.out.println(item);
			sum = sum + item;
		}
		System.out.println(sum);
		return sum;
	} 

	public static void main(String[] args){
			int[] anArray = toPower(4,3);
			MoreArrays.sumArray(anArray);
	}
}
