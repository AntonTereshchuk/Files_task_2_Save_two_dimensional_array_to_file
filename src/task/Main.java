package task;

import java.io.File;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		File file1 = new File("Two dimensional array.txt");
		int[][] twoDimensionalArray = new int[][] {{1,2},{3,4},{5,6}};
		
		saveArrayToFile(file1, twoDimensionalArray);
		
	}
	
	public static void saveArrayToFile(File file, int[][] array) {
		
	    try (PrintWriter pw = new PrintWriter(file)) {
	    	for (int i = 0; i < array.length; i++) {
	    	  for (int j = 0; j < array[i].length; j++) {
	    		  pw.print(array[i][j]);
	    	  }
	    	  pw.println();
	    	}
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	        	    
	 }
	
}
