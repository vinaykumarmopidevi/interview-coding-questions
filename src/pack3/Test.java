package pack3;



public  class Test {
	public static void main(String[]  args) {
		String val="Selenium Webdriver";
		StringBuilder sb=new StringBuilder();
		 for (int i = 0; i < val.length(); i++){
		        char c = val.charAt(i);
		        String s = sb.append(c).toString();
		        System.out.println(s);
		    }    
	}
	

}
