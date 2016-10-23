
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 3, 54, 23, 98, 99, 1, 12 };
		BubbleSort sort=new BubbleSort();
		int a[]=sort.getSortedArray(arr);
		for(int i:a){
			System.out.println(i);
		}

	}

	public int[] getSortedArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int temp = 0;
				if (arr[j] < arr[j + 1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}

			}
		}
		return arr;
	}

}
