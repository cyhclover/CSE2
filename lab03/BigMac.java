//Yuhua Chen
//Lab Section Wed
import java.util.Scanner; //using Scanner class

//This program that computes the cost of buying a some Big Macs. 
//It uses the Scanner class to obtain from the user how many Big Macs, 
//the cost per Big Mac, and the percentage tax (which depends on the state; 6% in PA, 8% in MA, etc).
//It then displays the total cost.

//
public class BigMac {
// main method 
    public static void main(String[] args) {
        Scanner myScanner;   //declare an instance of the Scanner object
        myScanner = new Scanner( System.in );
        //getting input from the user
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();  //store user's input into integer nBigMacs
    	System.out.print("Enter the cost per Big Mac as" + "a double (in the form xx.xx): " );
    	double bigMac$ = myScanner.nextDouble();
    	System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //convert percentage to proportion
        //Calculating input, and send output
        double cost$;
        int dollars,   //whole dollar amount of cost 
        dimes, pennies; //for storing digits
                        //to the right of the decimal point 
                         //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs +" BigMacs, at $" 
            + bigMac$ +" per bigMac, with a" +  " sales tax of "+ (int)(taxRate*100) 
                + "%, is $"+dollars+"."+dimes+pennies);
                    //printing out result

         		  }  //end of main method   
  } //end of class
