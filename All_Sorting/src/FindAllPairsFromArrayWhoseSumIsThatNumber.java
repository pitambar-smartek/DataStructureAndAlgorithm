
public class FindAllPairsFromArrayWhoseSumIsThatNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 2, 2,4, 85, 16, 7, 878, 19, 878, 211, 2, 1,1 };
		FindAllPairsFromArrayWhoseSumIsThatNumber(arr,18);
		
	}
	
	static int FindAllPairsFromArrayWhoseSumIsThatNumber(int arr[],int number){
		int[] arrarPair = new int[arr.length/2];
		int index =-1;
		boolean flag=true;
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length;j++){
				if(arr[i]+arr[j]==number){
					for(int k=0;k<arrarPair.length;k++){
						flag=true;
					//System.out.println("The pairs are="+arr[i]+" dd ="+arr[j]);
					if(arr[i]==arrarPair[k]){
					  flag=false;
					  break;
					}
					}
					if(flag){
						arrarPair[++index]=arr[i];
						arrarPair[++index]=arr[j];
					}
					break;
				}
			}
		}
		for(int i:arrarPair){
			System.out.println("pairs"+i);
		}
		return 5;
	}

}
