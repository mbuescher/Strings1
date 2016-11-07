/** ************************************************
  * Some code to experiment with Strings.
  */


import java.util.Scanner;

public class StringTest
{
  
  public static void main (String[] args)
  {
    String s1 = "Hello";
    String s2 = "There";

    Scanner kboard = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String s3 = kboard.nextLine();

    System.out.println (s1 + " " + s2 + ", " + s3 + ".");
    if (s3 == "Bob")
      System.out.println ("My name is Bob, too!  What a coincidence!");
    else
      System.out.println ("My name is Bob.");
    
    kboard.close();
  }
}
    
    
    