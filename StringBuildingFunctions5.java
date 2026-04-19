/*5. Write a Java Program for Eliminating all whitespace characters from a string using user defined 
function removeWhitespace()*/

package basics;

public class StringBuildingFunctions5 {
	public static String removeWhitespace(String str) {
		return str == null ? null : str.replaceAll("\\s", "");
		}

		public static void main(String[] args) {
		System.out.println("5. Remove Whitespace: " + removeWhitespace("Hello World"));
		}
		}



