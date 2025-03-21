package sample;

public class StringSumOfDigits2 {
    public static void main(String[] args) {
        String str = "t6est665 ehh2h738fhj j9hfkj443 897jhk6fj";
        String[] strArray=str.split(" ");

        for (String strValue : strArray) {
            char[] value=strValue.toCharArray();
            String result="";
            int sum=0;
            for (char c : value) {
                if(Character.isDigit(c)){
                    String val=String.valueOf(c);
                    result+=val;
                    sum=sum+Integer.parseInt(val);
                }
            }
           System.out.println(result+" "+sum);
        }
    }
}
