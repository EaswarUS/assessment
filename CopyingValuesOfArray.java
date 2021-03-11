package assesment;

public class CopyingValuesOfArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] {10,30,40,50};
		int[] arr2 = new int[arr1.length];
		
		
		System.out.println("First Array");
		for (int i = 0; i < arr1.length; i++) {
		arr2[i] = arr1[i];	
		System.out.println(arr1[i] + " ");
		}
		System.out.println();
	    System.out.println("Copy Of First Array");
        for (int i = 0; i < arr2.length; i++) {
        	System.out.println(arr2[i] +" ");
			
		}
	}

}
