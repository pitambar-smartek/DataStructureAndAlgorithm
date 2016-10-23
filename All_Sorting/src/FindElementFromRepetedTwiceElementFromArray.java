
public class FindElementFromRepetedTwiceElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 22, 22, 2, 2, 85, 85, 1, 4, 19, 19, 211, 211, 1 };
		getUnRepeatedFromArray(arr);
	}

	static int getUnRepeatedFromArray(int arr[]) {
		boolean flag=true;
		for (int i = 0; i < arr.length; i++) {
			flag=true;
			for (int j = arr.length-1; j >=0; j--) {
				if (i!=j && arr[i] == arr[j]) {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.println("this is unique number form repeated twice element from array=" + arr[i]);
				break;
			}

		}
		return 0;
	}

}
