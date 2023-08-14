/*
A number is divisible by 3 if the sum of its digits is divisible by 3. For example, 153 is divisible by 3 because 1 + 5 + 3 = 9 and 9 is divisible by 3.
 
Write a program that collects three integer inputs representing the place values of a three-digit number. Determines whether the sum of the digits is divisible by 3. If any integer entered is a negative value, output Invalid input!
 
Output a formatted message identifying if the three-digit number is divisible by 3, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.
 
If the input is:
 
1
5
3
 
the output is:
 
153 is divisible by 3!
 
Alternatively, if the input is:
 
1
0
4
 
the output is:
 
104 is not divisible by 3!
 
Alternatively, if the input is:
 
1
-5
3
 
the output is:
 
Invalid input */
    

    import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         /* Type your code here. */
      int digitOne = scnr.nextInt();
      int digitTwo = scnr.nextInt();
      int digitThree = scnr.nextInt();
      
     if (digit1 < 0 || digit2 < 0 || digit3 < 0) {
            System.out.println("Invalid input!");
        } else {
            int sum = digit1 + digit2 + digit3;
     }
         
      if((digitOne + digitTwo + digitThree) % 3 == 0){
         System.out.printf("%d%d%d is divisibile by 3!", digitOne, digitTwo, digitThree);
         System.out.println();
         }else{
            System.out.printf("%d%d%d is not divisibile by 3!", digitOne, digitTwo, digitThree );
            System.out.println();
            }

            int hundreds = scnr.nextInt(); 
            
    }

}
        
