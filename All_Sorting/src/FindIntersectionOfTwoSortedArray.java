
public class FindIntersectionOfTwoSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 2, 2, 4, 85, 16, 7, 878, 19, 878, 211, 2, 1, 1 };
		int arrOne[] = { 1, 211, 187, 9, 22 };
		for (int i : getIntersectionOfTwoSortedArray(arrOne, arr)) {
			System.out.println(i);
		}
	}

	static int[] getIntersectionOfTwoSortedArray(int smaller[], int bigger[]) {
		int index = -1;
		boolean flag =false;
		int interSectionArray[] = new int[bigger.length];
		for (int i = 0; i < bigger.length; i++) {
			for (int j = 0; j < smaller.length; j++) {
				if (bigger[i] == smaller[j]) {
					for (int k = 0; k < interSectionArray.length; k++) {
						flag=true;
						if(bigger[i]==interSectionArray[k]){
							flag=false;
							break;
						
						}
					}
					if(flag){
						interSectionArray[++index] = bigger[i];
					}
				}
			}

		}
		return interSectionArray ;
	}

}
