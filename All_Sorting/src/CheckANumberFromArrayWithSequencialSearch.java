
public class CheckANumberFromArrayWithSequencialSearch {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 11, 10, 18, 17, 16, 9, 12, 13, 14,15,16 };
		System.out.println("Is "+8+" this number present in Array= "+isNumberPresentInArray(arr,8));
	}

	public static boolean isNumberPresentInArray(int arr[],int number) {
		int middleIndex = arr.length/2;
		int j=1;
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if(i>middleIndex){
				
				return flag;
			}else if(arr[i]==number || arr[arr.length-j]==number){
				flag = true;
			    break;	
			}
			j++;
			System.out.println("i value = "+i);
			    
			}
		return flag;
		}
	

}
