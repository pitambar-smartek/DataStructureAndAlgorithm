
public class FindTheLargestAndSmallestElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 2, 4, 85, 16, 7, 878, 19, 878, 211, 2, 1 };
		int largest = getLargestElementFromArray(arr);
		int smallest = getSmallestElementFromArray(arr);
		System.out.println("The smallest element=" + smallest);
		System.out.println("The Greatest element=" + largest);

		int secondsLargest = get2ndLargestElementFromArray(arr);
		int secondSmallest = get2ndSmallestElementFromArray(arr);
		System.out.println("The smallest element=" + secondSmallest);
		System.out.println("The Greatest element=" + secondsLargest);

	}

	static int getLargestElementFromArray(int arr[]) {
		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (large < arr[i]) {
				large = arr[i];
			}
		}
		return large;
	}

	static int getSmallestElementFromArray(int arr[]) {
		int samllest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (samllest > arr[i]) {
				samllest = arr[i];
			}
		}
		return samllest;
	}

	static int get2ndLargestElementFromArray(int arr[]) {
		int large = arr[0];
		int secondLargest = arr[1];
		if (arr[1] > arr[0]) {
			large = arr[1];
			secondLargest = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (large < arr[i]) {
				secondLargest = large;
				large = arr[i];

			} else if (large != arr[i] && secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	static int get2ndSmallestElementFromArray(int arr[]) {
		int samllest = arr[0];
		int secondSmallest = arr[1];
		if (arr[1] < arr[0]) {
			samllest = arr[1];
			secondSmallest = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (samllest > arr[i]) {
				secondSmallest = samllest;
				samllest = arr[i];
			} else if (samllest != arr[i] && secondSmallest > arr[i]) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}

}
