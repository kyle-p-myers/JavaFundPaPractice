/* CORRECT 
 * 
Write a program that creates an array to hold three values of type double. 
The program should collect the three double values as input and store them in the array.
 Then calculate the average value of the array.
 
Output the array values and calculated average value, ending with a newline. 
Ensure your program output matches the example formatting below and works for a variety of input values.
 
If the input is:
 
10.0
10.5
11.0
 
the output is:
 
Array items: 10.0, 10.5, 11.0
Average: 10.5
 */

 import java.util.Scanner;

 public class AverageArray {
     public static void main(String[] args) {
        
 // add two for loops iteration and print
          Scanner scnr = new Scanner(System.in);
      /* Type your code here. */
    double[] numbers = new double[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scnr.nextDouble();
        }
        System.out.print("Array Items: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.1f", numbers[i]);
            if(i < numbers.length - 1){
                System.out.print(", ");
            }
        }

        double average = ((numbers[0] + numbers[1] + numbers[2]) / numbers.length);

        System.out.println("\nAverage: " + average);




    }
}
 
 
