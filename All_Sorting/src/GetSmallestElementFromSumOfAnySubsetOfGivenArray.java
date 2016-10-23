
//Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
public class GetSmallestElementFromSumOfAnySubsetOfGivenArray {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 3, 4, 85, 16, 7, 8, 19, 10, 211 };
     arr= getSortedArray(arr);
     for(int j:arr){
    	 System.out.println("Element ="+j);
     }
      int smallest=getSmallestElementFromSubsetOfElement(arr,arr.length);
      System.out.println("Smallest Element from Array="+smallest);
	}

	private static int getSmallestElementFromSubsetOfElement(int[] arr, int length) 
		{
		   int res = 1; // Initialize result
		 
		   // Traverse the array and increment 'res' if arr[i] is
		   // smaller than or equal to 'res'.
		   for (int i = 0; i < length && arr[i] <= res; i++)
		   {
		       res = res + arr[i];
		   }
		 
		   return res;
		
	}

	private static int[] getSortedArray(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				int temp=0;
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
