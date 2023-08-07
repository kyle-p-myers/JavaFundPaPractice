/*
Write a program that collects any number of non-negative integer inputs and calculates the sum of the values.
 A negative integer should end the input collection and is not part of the sum.
 
Output the smallest non-negative value and the sum of the non-negative input values, ending with a newline. 
Ensure your program output matches the example formatting below and works for a variety of input values.
 
If the input is:
 
15 
20 
0 
3 
-1 
 
the output is:
 
Smallest: 0 
Sum: 38 */
    import java.util.Scanner;

public class SumAndSmallest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);



int smallest = Integer.MAX_VALUE; 
int sum = 0; 
int input; 

while((input = scnr.nextInt()) >= 0){
sum += input; 
smallest=Math.min(smallest, input);

}

int smallest = Integer.MAX_VALUE; 
int sum = 0; 
int input; 

while((input = scnr.nextInt()) >= 0){
    sum += input; 
    smallest = Math.min(smallest, input);

}

System.out.print(sum);
    }

}

 
