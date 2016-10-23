
public class FindDuplicateNumberInSerieseOfIntegerNumberWhichContainOnlyOneDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 11, 10, 18, 17, 16, 9, 12, 13, 14,15,16 };
		System.out.println("Missing Number from Array=" + getDuplicateNumberFromArray(arr));
	}

	public static int getDuplicateNumberFromArray(int arr[]) {
		int summetion = (arr.length-1) * (arr.length ) / 2;
		System.out.println("summeation=" + summetion);
		for (int i = 0; i < arr.length; i++) {
			summetion = summetion - arr[i];
		}
		return summetion;
	}

}
