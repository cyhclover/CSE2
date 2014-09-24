//Yuhua Chen
//homework 5 program 2
//lab wed
//
//This program has three boolean variables to each of which the value
//of true or false is randomly assigned. 
// The program should then present the expression to the user and ask the user
//to state the result of of the expression. Then the program will compare the
//user result with the real answer
//
//

import java.util.Scanner;

public class BoolaBoola{
    public static void main(String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        int bool1, bool2,bool3; //3 int assigned from Math.random
        boolean b1,b2,b3; //booleans according to the random int
        int operator1, operator2; //2 int assigned for showing operator
        String o1, o2;  //2 string according to operator1, and operator2
        String userAnswer;
        boolean ua; //boolean according to String userAnswer;        boolean realAnswer;
        boolean realAnswer = true;
        bool1 = (int)(Math.random()*2); //0 or 1
        bool2 = (int)(Math.random()*2); //0 or 1
        bool3 = (int)(Math.random()*2); //0 or 1
        operator1 = (int)(Math.random()*2); //0 or 1
        operator2 = (int)(Math.random()*2); //0 or 1
        // assign boo1 - 3 to booleans
        b1 = (bool1 == 0)? false:true;
        b2 = (bool2 == 0)? false:true;
        b3 = (bool3 == 0)? false:true;
        //assign o1 and o2 to operator string
        o1 = (operator1 == 0)? "||":"&&";
        o2 = (operator2 == 0)? "||":"&&";
        //calculating the real answer using switch statement
        switch (o1+o2){
            case "||&&": 
                realAnswer = b1||b2&&b3;
                break;
            case "||||":
                realAnswer = b1||b2||b3;
                break;
            case "&&&&":
                realAnswer = b1&&b2&&b3;
                break;
            case "&&||":
                realAnswer = b1&&b2||b3;
                break;
        }
        //asking user for answer
        System.out.print("Does "+b1+" "+o1+" "+b2+" "+o2+" "+ b3);
        System.out.print(" have the value true(t/T) or false(f/F)? "); 
        userAnswer = sc.next();
        //convert user answer to boolean
        switch (userAnswer){
            case "t": case "T":
                ua = true;
                break;
            case "f": case "F":
                ua = false;
                break;
            default:
                System.out.println("Wrong; try again");
                return;
        }
        //compare answer
        if (ua == realAnswer)
            System.out.println("Correct");
        else
            System.out.println("Wrong; try again");
    }   
}