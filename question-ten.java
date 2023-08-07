/*
An existing class Customer() has been provided in Customer.java. 
Write a program in main() of CustomerAge.java to accept one string input and one integer input for a customer's 
name and age fields, respectively. Use the existing customer1 and customer2 reference variables provided in the 
template to set the name and age of both customer objects using the setName() and setAge() methods. Determine which 
customer is older using its getAge() method.
 
Output the older customer's information using its printInfo() method, ending with a newline.
 Ensure your program output matches the example formatting below and works for a variety of input values.
 
If the input is:
 
Jane
25
John
29 
 
the output is:
 
Customer that is older:
Name: John
Age: 29
 */

 import java.util.Scanner;

public class CustomerAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        String name1 = scanner.nextLine();
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String name2 = scanner.nextLine();
        int age2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        customer1.setName(name1);
        customer1.setAge(age1);

        customer2.setName(name2);
        customer2.setAge(age2);

        Customer olderCustomer;
        if (customer1.getAge() > customer2.getAge()) {
            olderCustomer = customer1;
        } else {
            olderCustomer = customer2;
        }

        System.out.println("Customer that is older:");
        olderCustomer.printInfo();
    }
}
