/*
Write a program that collects two integer inputs and assigns them to the variables starting_num and multiplier.
Multiply starting_num by multiplier and output the result. Repeat this process two more times, 
each time multiplying the previous result by multiplier. The three product outputs should be separated by 
a whitespace character, ending with a newline.
 
If the input is:
 
2 5
 
the output when starting_num = 2 is:
 
10 50 250 */

public static void main(String []args) {

    int starting_num = scnr.nextInt(); 
    int multiplier = scnr.nextInt(); 

    int result = starting_num * multiplier; 

    System.out.println(result);

    result *= multiplier; 
    System.out.println(result);
    
    result *= multiplier; 
    System.out.println(result);
    

/* 8/14 attempt */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      /* Type your code here. */
         int starting_num = scnr.nextInt(); 
    int multiplier = scnr.nextInt(); 

    int result = starting_num * multiplier; 
    
    System.out.print(result + " ");
    
    result *= multiplier; 
    System.out.print(result + " ");
    
    result *= multiplier; 
    System.out.println(result + " ");
   }
}








}
