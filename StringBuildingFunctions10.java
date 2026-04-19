/*10.Write a Java Program for Counting the number of words in a string using user defined
  function countWords()*/

package basics;

public class StringBuildingFunctions10 {
	public static int countWords(String str) {
		if (str == null || str.trim().isEmpty()) {
		return 0;
		}
		return str.trim().split("\\s+").length;
		}

		public static void main(String[] args) {
		System.out.println("10. Word Count: " + countWords("Hello world java"));
		}
		}




