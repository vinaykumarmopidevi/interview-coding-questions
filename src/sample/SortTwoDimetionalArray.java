package sample;

import java.util.Arrays;

public class SortTwoDimetionalArray {

	public static void main(String[] args) {
		double[][] array = { 
				{ 45, 5 }, 
				{ 13, 1.55 }, 
				{ 53, 100.6 }, 
				{ 12.1, .85 } 
				};
//		java.util.Arrays.sort(array, new java.util.Comparator<double[]>() {
//		    public int compare(double[] a, double[] b) {
//		        return Double.compare(a[0], b[0]);
//		    }
//		});
		Arrays.sort(array, (a,b) -> Double.compare(a[0], b[0]));
		for(int i=0; i<array.length; i++) {
	            System.out.println("Values at arr["+i+"]["+0+"] is "+array[i][0]);
	       
	    }
		

	}

}
