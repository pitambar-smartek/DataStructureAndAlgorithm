
public class FindTheFirstRepeatedElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 3, 4, 85, 16,3, 7, 8,4,  10, 211 };
		getFirstRepeatedNumber(arr);
	}
    static void getFirstRepeatedNumber(int arr[]) {
    	boolean flag=false;
    	for(int i=0;i<arr.length;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]==arr[j]){
    				System.out.println("The First Repeated Number ="+arr[i]);
    				flag=true;
    				break;
    				
    			}
    		}
    		if(flag){
    			break;
    		}
    	}
    }

}
