
public class FindoutFirstNonRepeatingElementFromArray {


	public static void main(String[] args) {
		int arr[] = { 1,1, 22, 3, 4, 85, 16,3, 7, 8,4,  10, 211 ,22};
		getFirstRepeatedNumber(arr);
	}
    static void getFirstRepeatedNumber(int arr[]) {
    	boolean flag=true;
    	for(int i=0;i<arr.length;i++){
    		flag=true;
    		for(int j=0;j<arr.length;j++){
    			if(i!=j&&arr[i]==arr[j]){
    				
    				flag=false;
    				break;
    				
    			}
    		}
    		if(flag){
    			System.out.println("The First Non-Repeated Number from array ="+arr[i]);
    			break;
    		}
    	}
    }

}


