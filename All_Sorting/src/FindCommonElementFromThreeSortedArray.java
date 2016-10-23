
public class FindCommonElementFromThreeSortedArray {

	public static void main(String[] args) {
		int[] input1 = { 1, 5, 10, 20, 40, 80 };
		int[] input2 = { 6, 7, 20, 80, 100 };
		int[] input3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
		getCommonElementFrom_3_SortedArray(input2, input1, input3);

	}

	private static void getCommonElementFrom_3_SortedArray(int[] small, int[] medium, int[] big) {

		for (int i = 0; i < small.length; i++) {
			for (int j = 0; j < medium.length; j++) {
				if (small[i] == medium[j]) {
					for (int k = 0; k < big.length; k++) {
						if (small[i] == big[k]) {
                             System.out.println("The common Element from 3 aray="+small[i]);
                             break;
						}
					}
					break;

				}
			}
		}

	}

}
