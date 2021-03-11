package assesment;

public class EvenPosition {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,7,8,9};
		System.out.println("Even Position Of an Array");
		
		for (int i = 1; i < arr.length;i=i+2) {
			System.out.println(arr[i]);
			
		}

	}

}
