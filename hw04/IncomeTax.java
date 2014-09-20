//Yuhua Chen
//homework4
//
//
//This program prompts the user to enter an int that gives the thousands
//of dollars of income and then writes out the amount of tax on the income,
//given the following (progressive) schedule:
//<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%
//
////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        int income$=0; //initialize income$
        double taxRate;
        double tax$;
        System.out.print("Enter an int giving the number of thousands: ");
        //ask user for input
        if (sc.hasNextInt()){
            income$ = sc.nextInt(); 
            //if it is a int, it will be stored as income in thousand dollars
            if (income$ <= 0){
                System.out.println("You did not enter positive int");
                //if user entered a negative number, promt the user
                return;
                //terminate the program
            }
        }
        else
        {
            System.out.println("You did not enter an int");
            return;
        }
        //assign different tax rate according to the income
        //<20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%
        if (income$ < 20) taxRate = 0.05;
        else if (income$<40) taxRate = 0.07;
        else if (income$<78) taxRate = 0.12;
        else taxRate = 0.14;
        tax$ = income$*1000*taxRate; //calculate tax
        System.out.printf("The tax rate on $%d,000 is %.1f%%,", income$,taxRate*100);
        System.out.printf("and the tax is $%.1f\n", tax$);
        
    }
}