
public class CheckANumberFromArrayWithBinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 3, 4, 85, 16, 7, 8, 19, 10, 211 };
		arr = getSortedArray(arr, 85);
		System.out.println("Is " + 8 + " this number present in Array= " + isNumberPresentInArray(arr, 272));
	}

	public static int[] getSortedArray(int arr[], int number) {
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

	public static boolean isNumberPresentInArray(int arr[], int searchNumber) {
		int firstNumber=0;
		int lastNumber=arr.length-1;
		int middleNumber= (firstNumber+lastNumber)/2;
		while(firstNumber<=lastNumber){
			if(arr[middleNumber]>searchNumber) {
				lastNumber=middleNumber-1;
				
			}else if (arr[middleNumber]==searchNumber){
				System.out.println("number is found");
				return true;
			}else {
				firstNumber=middleNumber+1;
			}
			middleNumber=(firstNumber+lastNumber)/2;
			
		}
		
        return false;
	}
}
