/*8. Write a Java Program for Verifying if a string contains only numeric characters using user defined 
 function isNumeric() */

package basics;

public class StringBuildingFunctions8 {
	public static boolean isNumeric(String str) {
		if (str == null || str.isEmpty()) {
		return false;
		}
		return str.matches("\\d+");
		}

		public static void main(String[] args) {
		System.out.println("8. Is Numeric: " + isNumeric("12345"));
		}
		}



