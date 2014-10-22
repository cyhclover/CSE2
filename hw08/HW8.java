//Yuhua Chen
//homework 08
//the purpose of this program is to add methods according to the given main method code

import java.util.Scanner;
public class HW8{
    //main method
    public static void main(String []arg){
        char input;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input=getInput(scan,"Cc");
        System.out.println("You entered '"+input+"'");
	    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	    input=getInput(scan,"yYnN",5); //give up after 5 attempts
    	if(input!=' '){
       	System.out.println("You entered '"+input+"'");
    	}
    	input=getInput(scan,"Choose a digit.","0123456789");
    	System.out.println("You entered '"+input+"'");
  }  
 //Calls like getInput(scan,”dEf”) should force the user to enter a string from 
 //the keyboard that is exactly one character long and that is one of the characters
 //in the string “dEf”, and it should return the character entered
    public static char getInput(Scanner sc, String st){
        char c;
        String input;
        char temp,inputc;
        int i;
        while (true){
            input = sc.next();   //get input from user
            if (input.length()>1)  // if user enter more than one character, promt the user
                System.out.print("You should enter exactly one character- ");
            else
            {
                inputc = input.charAt(0);  //get the first character from the String input
                for (i=0;i<st.length();i++)
                {
                    temp = st.charAt(i); //compare inputc with each character in String st.
                    if (temp==inputc) //character compare with character
                        return inputc;
                    else if (i == st.length()-1) //if the program already compare all the characters in the string, 
                                                 // and there is still no match, ask the user to try again
                        System.out.print("You did not enter a character from the list'"+st+"';try again- ");
                }
            }
        }
    }
//Calls like getInput(scan,”abc”,7) should try to force the user to enter a string 
//that consists of exactly one character and is one of the characters
//in the string “abc”, and it should return the character entered, 
//but it should give up and return the character ‘ ‘ if the user 
//fails to enter one of the required characters after 7 attempts.
    public static char getInput(Scanner sc, String st, int trial){
        char c;
        String input;
        char temp,inputc;
        int i;
        int cntTrials=0; 
        while (cntTrials<trial){  //only allow user test for number of trial times
            cntTrials++;
            input = sc.next();   //get input from user
            if (input.length()>1)  // if user enter more than one character, promt the user
                System.out.print("You should enter exactly one character-");
            else
            {
                inputc = input.charAt(0);  //get the first character from the String input
                for (i=0;i<st.length();i++)
                {
                    temp = st.charAt(i); //compare inputc with each character in String st.
                    if (temp==inputc) //character compare with character
                        return inputc;
                    else if (i == st.length()-1) //if the program already compare all the characters in the string, 
                                                 // and there is still no match, ask the user to try again
                        System.out.print("You did not enter a character from the list '"+st+"'; try again- ");
                }
            }
        }
        System.out.printf("\nYou failed after %d trials\n", trial);
        return  ' ';
    }
// Calls like getInput(scan,”Prompt: “,”059”) should use the string 
//“Prompt: “, should force the user to enter a string with exactly 
//one character that is one of the characters in the string “059”, 
//and should return the character entered.  The phrase “force the 
//user” means that the program should repeatedly prompt the user 
//until the user enters the correct input. 
    public static char getInput(Scanner sc, String prompt,String options){
        int len,i;
        String input;
        char inputc,temp;
        while(true)
        {
            System.out.println(prompt);
            System.out.print("Enter one of: ");
            len = options.length();
            for (i = 0;i<len;i++){
                System.out.print("'"+options.charAt(i)+"'");
                if (i == (len-1))
                    System.out.print("- ");
                else 
                    System.out.print(",");
            }
            input = sc.next();
            if (input.length()>1)  // if user enter more than one character, promt the user
                System.out.println("Enter exactly one character");
            else
            {
                inputc = input.charAt(0);  //get the first character from the String input
                for (i=0;i<options.length();i++)
                {
                    temp = options.charAt(i); //compare inputc with each character in String option.
                    if (temp==inputc) //character compare with character
                        return inputc;
                    else if (i == options.length()-1) //if the program already compare all the characters in the string, 
                                                 // and there is still no match, ask the user to try again
                        System.out.println("You did not enter an acceptable character");
                }
                
            }
        }
    }
}
