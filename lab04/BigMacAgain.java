//Yuhua Chen
//CSE2 Wed Lab
//LAB04
// This program uses the Scanner class to obtain from users how many Big Macs they want and whether
//they want an order of fries. It then prints out the total cost of the meal. Big Macs still cost $2.22 each, 
//and an order of fries costs $2.15. It will print out the total price
//
//


import java.util.Scanner; //import scanner class

public class BigMacAgain{
    public static void main(String[] args){
        //declare variables and constants
        Scanner myScanner;
        int numOfMacs;
        final double costPerMac$ = 2.22;
        final double costOfFries$ = 2.15;
        String answer; //answer for whether wants fries
        double totalPriceMacs$,totalCost$;
        myScanner = new Scanner(System.in);
        //ask user for inputs
        System.out.print("Enter the number of Big Macs: ");
        if (myScanner.hasNextInt()){
            numOfMacs = myScanner.nextInt(); //if it is a int, this int will be assigned to numOfMacs
            if (numOfMacs <= 0)
                System.out.println("You did not enter an int > 0");
                //if numOfMacs <= 0, promt the user
            else
            {   
                totalPriceMacs$=costPerMac$*numOfMacs; //calculate the price for total price of macs
                System.out.print("You ordered "+ numOfMacs+" for a cost of "+numOfMacs
                    +" x 2.22 =  $");
                System.out.printf("%1$.2f\n",totalPriceMacs$);
                   //print out the results
                   
                //Asking user if he/she wants fries
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                answer = myScanner.next(); 
                //if yes
                if ((answer.equals("Y")) || (answer.equals("y")))
                {
                    System.out.println("You ordered fries at a cost of $2.15");
                    totalCost$ = costOfFries$+totalPriceMacs$;
                    System.out.printf("The total cost of the meal is $%1.2f\n", totalCost$);
                }
                //if no
                else if ((answer.equals("N")) || (answer.equals("n")))
                {
                    System.out.printf("The total cost of the meal is $%1.2f\n", totalPriceMacs$);
                    return;
                }
                //if user hit something wrong
                else
                    System.out.println("You did not enter one of \'y\', \'Y\', \'N\', \'n\'");
                    return;
            }
            
        }
        //if user did not print an integer
        else{
            System.out.println("You did not enter an int");
            return;
        }
            
            
        
            
        
    }
}