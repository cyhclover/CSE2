//Yuhua Chen
//hw03
//program2

import java.util.Scanner;
//
//This program prompts the user to enter a double and then prints out a crude 
//estimate of the cube root of the number and the value of this crude guess 
//when cubed.
//
/////////////////////////////////////////////////////////////////////////////

public class Root {
    public static void main(String[] args) {
        Scanner sc;  //declare a scanner sc
        sc = new Scanner(System.in);
        System.out.print("Enter a double, and I print its cube root: ");
        double x = sc.nextDouble();
        double guess;
        double cube;
        //algorithm for calculating the guess value
        guess = x/3;
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        //crude guess when cubed
        cube = guess*guess*guess;
        //output the results
        System.out.println("The root is "+guess);
        System.out.println(guess+ " * " +guess+" * "+guess);
        System.out.println(" = "+cube);
        
    }
    
}