
public class RemovingDuplicateElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 22, 2, 2,4, 85, 16, 7, 878, 19, 878, 211, 2, 1,1 };
		String builder =new String("");
		for(int i=0;i<arr.length;i++){
			if(!builder.contains(","+arr[i]+",")){
				builder=builder.concat(arr[i]+",");
			}
			
		}
		
       System.out.println(builder+" nothing");
       
       for(int i:getDuplicateElementFromArray(arr)){
    	   System.out.print(i+",");
       }
	}
     
	static int[] getDuplicateElementFromArray(int arr[]){
		int arrOne[]=new int[arr.length];
		arrOne[0]=arr[0];
		boolean flag =true;
		int index= 0;
		for(int i=1;i<arrOne.length;i++){
			for(int j=0;j<arrOne.length;j++){
			if(arr[i]==arrOne[j])
				flag =false;
			}
			if(flag){
				arrOne[++index]=arr[i];
			}
			else{
				arr[i]=0;
			}
			flag = true;
		}
		return arrOne;
		}
	}
