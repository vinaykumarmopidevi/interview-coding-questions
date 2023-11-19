package pack1;

public class demo {
	public static void main(String[] args) {
		   String input = "Vinay Kumar";
		    
		    char[] inputArr=input.toCharArray();
		    
		    for(int i=0;i<inputArr.length;i++){
		        int count=0;
		        for(int j=1;j<inputArr.length;j++){
		            if(inputArr[i]==inputArr[j]){
		                count++;
		            }
		            
		        }
		        if(count == 0){
		            System.out.print(inputArr[i]+" ");
		        }
		    }
		    
	   }

}
