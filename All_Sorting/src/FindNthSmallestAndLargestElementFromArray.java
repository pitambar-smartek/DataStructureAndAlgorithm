import java.util.Scanner;

public class FindNthSmallestAndLargestElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 2, 4, 85, 16, 7, 878, 19, 878, 211, 2, 1 };
		arr=getSortedArray(arr);
		Scanner scanner =new Scanner(System.in);
		System.out.println("Please enter the Nth largest element you want= ");
		int nth=scanner.nextInt();
		if(nth<arr.length){
		System.out.println("The "+nth+ "largest elemnt is="+arr[nth-1]);
		}

	}
	
	public static int[] getSortedArray(int arr[]) {
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				} else {
					k++;
				}

			}
			if (k == arr.length) {
				System.out.println("it is sorted array");
				return arr;
			}
		}

		return arr;
	}

}
