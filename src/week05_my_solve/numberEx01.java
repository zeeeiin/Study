package week05_my_solve;

import java.util.Arrays;

public class numberEx01 {

	public static void main(String[] args) {
		
		String[] arr = {"75h", "123", "457", "a789", "ggg0", "fgd49", "ddd", "444"};		
		int[] arr2 = new int[8];	
		StringBuilder sb = new StringBuilder();
		   for (String str : arr) {
		        sb.append(str);
		 try {
	            // Try to parse the string as an integer and add it to arr2
	            int num = Integer.parseInt(str);
	            int i = sb.indexOf(str);
	            arr2[i / 3] = num;
	            System.out.println(Arrays.toString(arr2));
	        } catch (NumberFormatException e) {
	            // Handle the exception if the string cannot be parsed as an integer
	            System.out.println("NumberFormatException: " + str);
	        }

		}
	}

}
