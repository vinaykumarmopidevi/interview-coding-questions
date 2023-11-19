

import java.io.IOException;
import java.util.Random;

public class TmtSmp {

	public static void main(String[] args) throws IOException, InterruptedException {
		TmtSmp t=new TmtSmp();
		String str=t.getSaltString(3);
		System.out.println(str);
	}
	
	protected String getSaltString(int intSize) {
        String SALTCHARS = "0123456789";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < intSize) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        String name = saltStr.substring(0,1).toUpperCase() + saltStr.substring(1).toLowerCase();
       
        return name;

    }

}
