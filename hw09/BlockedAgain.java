//Yuhua Chen
//This program implements methods according to the
//main program 

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
    public static void allBlocks(int num){
        int i;
        for (i=1; i<=num; i++){
            line(i,num);    //print line() num (from user input) times
        }
    }
    public static void line(int n, int m){
        int i=0,j=0;
        int dif;
        int lineLen=2*m-1;
        //creating loops for printing
        for (j = 0; j<=n; j++){
            for (i=0; i<=lineLen;i++)
            {
                dif = m-n;  //counter for spacing
                if (i<dif)
                    System.out.print(" ");
                else if (i<(dif+ 2*n- 1)){ 
                    if (j == n)
                        System.out.print("-"); //if j==n, prints -
                    else
                        System.out.print(n); //else, prints the number
                }
                else{
                    i = lineLen;   //after printing front spacings and number 
                    System.out.println(); //and the loop by println & make i to lineLen
                }
            }
        }
    }
    public static int getInt(){
        int a = 0;
        boolean tf;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter an int: ");
        while(true){ //continue the loop until the right input is entered
            tf = checkInt(sc); //check if an int is entered
            if (tf == true){   //if it pass at this point go to next method 
                a = sc.nextInt(); //if yes, get the int
                tf = checkRange(a); //check its range
                if (tf == true) //if the rangeCheck is true, return the right int
                                //end the loop
                    return a; 
                else 
                    System.out.print("try again:");
            }
            else  //if not, do it again
            {
                System.out.print("try again:");
            }
        }
    }
    
    public static boolean checkInt(Scanner sc){
        if (sc.hasNextInt()) //return true if int is entered
            return true;
        else{
            System.out.print("You did not enter an int; ");
            sc.next();  //promt the user, and return false
            return false;
        }
    }
    
    public static boolean checkRange(int check){
        if ((check<1)||(check>9)){ //check range, if false, prompt the user
            System.out.print("You did not enter an int in [1,9];");
            return false;
        }
        else
            return true;  //when true, return true
    }
}