/*

Debt ratio is a ratio of total debt to total assets, calculated using the formula:
Total Debt / Total Assets
 
The DebtMeasure.java file contains existing code that collects input for totalDebt and totalAssets, 
then passes the inputs into the Debt object's calculateDR() method. The code then returns the debtRatio using 
the Debt object's getDR() method.
 
Write code in the Debt class of Debt.java that has the following field and methods:
 
debtRatio: public field of type double
calculateDR: private method with two parameter variables of type double for totalDebt and totalAssets
The calculateDR method should calculate the debt ratio and assign the results to the debtRatio field.
Use the method signature public void calculateDR(double totalDebt, double totalAssets).
getDR: private accessor method that returns the debtRatio field value
Ensure your program output matches the example formatting below and works for a variety of input values.
 
If the input is:
 
250000
300000
 
the output when 250000 is the total debt and 300000 is the total assets is:
 
The Company's total debt is in the amount of $250,000.00, and total assets are in the amount of $300,000.00, 
which gives a debt ratio of 0.83.

 */

 public class Debt {
   private double debtRatio;
      
   // TODO: Define public method - calculateDR()
  public void calculateDR(double totalDebt, double totalAssets){
     debtRatio = totalDebt / totalAssets; 
     }
   
   // TODO: Define public method - getDR()
   public double getDR(){
      return debtRatio; 
      }
}
    }
}
