// Program to find a substring in a String without using an inbuilt method of String class for the same.

public class letsTry {
	// two variable intialized
     static String Str;
	 static int Sub;
	// main method 
   public static void main(String args[]) {
	   // Asking for String from user
	  System.out.print("Enter Any String which you want Sub: ");
	  // Reading and assigning the value given by user
	  Str = System.console().readLine(); 
	  // asking for index where the user want to Sub
      System.out.print("Enter the Index Where you Want to Sub the String: ");
	  // Reading and assigning the value given by user
      Sub = Integer.parseInt(System.console().readLine()); 
	  char[] newStr = Str.toCharArray();
	   System.out.print("SubString of the Given String is : ");
	   // For loop for SubString and Printing the value
	  for(int i = Sub+1; i<newStr.length;i++){
      // output the value with subString method
      System.out.print((newStr[i]));
	  }

   }
}