//Yuhua Chen
//homework4 program2
//
//
//This program prompts the user to enter an integer for the month (1 for
//January, 2 for February, etc.)  and then displays the number of days in 
//the month).  
//
///////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Month{
    public static void main(String[] args){
        int month;
        int daysInMonth;
        Scanner sc;
        sc = new Scanner(System.in);
        int year;
        int rm4;  //remainder when int year is divided by 4
        int rm100; //remainder when int year is divided by 100
        int rm400; //remainder when int year is divided by 400
        System.out.print("Enter an int giving the number of the month (1-12):");
        // ask user for int
        if (sc.hasNextInt())
        {
            month = sc.nextInt();
            //if user did not enter an int between 1 and 12
            if ((month < 1)||(month>12))
            {
                System.out.println("You did not enter an int between 1 and 12");
                return;
            }
        }
        //if user did not enter an int
        else
        {
            System.out.println("You did not enter an int");
            return;
        }
        //extra calculation when user enter 2
        if (month == 2)
        {
            System.out.print("Enter an int giving the year ");
            if (sc.hasNextInt())
            {
                year = sc.nextInt();
                //if user entered a valid answer, start caculation
                //The year is evenly divisible by 4;
                //If the year can be evenly divided by 100, it is NOT a leap year, unless;
                //The year is also evenly divisible by 400. Then it is a leap year.
                rm4 = year % 4;
                rm100 = year % 100;
                rm400 = year % 400;
                if ((rm4 == 0) && (rm100!=0))//2004
                    daysInMonth=29;
                else if ((rm4 == 0) && (rm400==0)) //2000
                    daysInMonth=29;
                else
                    daysInMonth=28;   //rest are not in leap years
            }
            else 
            {
                System.out.println("You did not enter a int");
                return; 
            }

        }
        else if ((month == 1)||(month == 3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
            daysInMonth = 31;
        else
            daysInMonth = 30;
        
        //print result
        System.out.println("The month has "+daysInMonth+" days");
    }
}