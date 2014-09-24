//Yuhua Chen
//lab wed
//homework 5  program 1
//
//
//This program prompts the user
//to enter a choice of a burger, a soda, or fries. Then the program prompts
//the users for details of their choices.
//
//

import java.util.Scanner;

public class BurgerKing{
    public static void main(String[] args){
        String input1, input2; //first and second input from the user
        Scanner sc;
        sc = new Scanner(System.in);
        //print out prompt to user
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("    Burger (B or b)");
        System.out.println("    Soda (S or s)");
        System.out.print("    Fries (F or f)  ");
        input1 = sc.next();
        //detect single character
        if (input1.length() != 1)
        {
            System.out.println("a single character expected");
            return;
        }
        switch (input1){
            case "b": case "B": //when user choose burger
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println("    C or c for cheese");
                System.out.print("    N or n for none of the above ");
                input2 = sc.next();
                //detect single character
                if (input2.length() != 1)
                {
                    System.out.println("a single character expected");
                    break;
                }
                switch (input2){  
                    case "a": case "A":  //all the fixins
                        System.out.println("You ordered a burger all the fixins");
                        break;
                    case "c": case "C": //with cheese
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "n": case "N": //with no fixins
                        System.out.println("You ordered a burger");
                        break;
                    default: //non of above
                        System.out.println("You did not enter any of A, a, C, c, N, n");
                        break;
                }
                break;
            case "s": case "S": //if user wants soda
                System.out.print("Do you want Pepsi (p or P),Coke (c or C), Sprite (s or S) or Mountain Dew (M or m): ");
                input2 = sc.next();
                //detect single character
                if (input2.length() != 1)
                {
                    System.out.println("a single character expected");
                    break;
                }
                switch (input2){
                    case "p": case "P": //pepsi
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "c": case "C": //coke
                        System.out.println("You ordered a Coke");
                        break;
                    case "s": case "S": //sprite
                        System.out.println("You ordered a Sprite");
                        break;
                    case "m": case "M": //mounain dew
                        System.out.println("You ordered a Mountain Dew");
                        break;
                    default: //none of above
                        System.out.println("You did not enter any of P, p, C, c, S, s, M, m");
                        break;
                }
                break;
            case "f": case "F":
                System.out.print("Do you want a large or small order of fries (l,L,s, or S): ");
                input2 = sc.next();
                //detect single character
                if (input2.length() != 1)
                {
                    System.out.println("a single character expected");
                    break;
                }
                switch (input2){
                    case "l": case "L": //large fries
                        System.out.println("You ordered large fries");
                        break;
                    case "s": case "S": //small fries
                        System.out.println("You ordered small fries");
                        break;
                    default: //none of above
                        System.out.println("You did not enter any of L, l, S, s");
                        break;                    
                }
                break;
            default:
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                break;
        }
    }
}