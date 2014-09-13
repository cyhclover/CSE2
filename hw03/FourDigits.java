//Yuhua Chen
//hw03
//program3

import java.util.Scanner;

//
// program that prompts the user to enter a double and  
//then prints out the first four digits to the right 
//of the decimal point.
////////////////////////////////////////////////////////

public class FourDigits {
    public static void main(String[] args) {
        
        Scanner sc; //declare scanner
        sc = new Scanner(System.in);
        System.out.println("Enter a double and I display the four digits to the right of the decimal point: ");
        double x = sc.nextDouble();
        int d1,d2,d3,d4; //first four digits to the right of the decimal points

        d1 = (int)(x*10) - ((int) x)*10;  
        //if x = 1.1234, this is 1.1234*10 - 1*10 = 1
        d2 = (int)(x*100) - ((int) x)*100 - d1*10;
        //1.1234*100 - 1*100 = 12 , 12 need to minus d1*10 to get the second digit
        //this method is able to get 0 in example of 1.0023
        //simply doing (int)(x*10000) - ((int) x)*10000 cannot display 0023 for x = 1.0023
        //without if statement
        d3 = (int)(x*1000) -((int) x)*1000- d1*100-d2*10;
        //1.1234*1000 - 1*1000 - 1*100 - 2*10 = 3
        d4 = (int)(x*10000) - ((int) x)*10000 -d1*1000-d2*100-d3*10;
        //1.1234*10000 - 1*1000 - 1*1000 - 2*100 - 3*10 = 4
        System.out.println("The four digits are " +d1+d2+d3+d4);
        //print out the output
        
        
    }
}