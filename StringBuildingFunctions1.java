/*1. Write a Java Program for Checking if a given string is null or contains only whitespace using user 
defined function isNullOrEmpty().*/

package basics;

public class StringBuildingFunctions1 {
	public static boolean isNullOrEmpty(String str) {
		return str == null || str.trim().isEmpty();
		}

		public static void main(String[] args) {
		System.out.println("1. Is Empty: " + isNullOrEmpty(""));
		}
		}



