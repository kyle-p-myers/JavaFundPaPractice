/*
Write a program that collects a full name as one string input.
 
Format and output the name as shown below:
 
lastInitial., firstName middleInitial.
 
If no middle name was provided, format and output the name as shown below:
 
lastInitial., firstName
 
If the input is:
 
Pat Silly Doe
 
the output is:
 
D., Pat S.
 
Alternatively, if the input is:
 
Julia Clark
 
the output is:
 
C., Julia */


    import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String fullName = scnr.nextLine(); 
      
      String[] nameParts = fullName.split(" "); 
      
      String firstName = nameParts[0];
      String lastName = nameParts[1];
      String middleInitial = " ";
      
      if(nameParts.length > 2){
         middleInitial = nameParts[1]; 
         lastName = nameParts[2];
         
          System.out.printf(nameParts[2].charAt(0) + "., " + firstName + " " + nameParts[1].charAt(0) + "." + "\n");
         }else{
           System.out.printf(nameParts[1].charAt(0) + "., " + firstName + "\n" ); 
            }
    }
}


