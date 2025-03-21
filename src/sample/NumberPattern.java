package sample;

public class NumberPattern {
   
    public static void main(String[] args) {
        int n=5;
        int num1=7,num2=4;
    
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
    
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print(num1+" ");
                }else{
                    System.out.print(num2+" ");
                }
            }   
            System.out.println();
        }
    }
/* output   
    7 
   7 4 
  7 4 7 
 7 4 7 4 
7 4 7 4 7 
*/
}
