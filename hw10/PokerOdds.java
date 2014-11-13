//Yuhua Chen
//This program simulates a poker card game
//showHands show user the 5 cards that has been randomly generated
//simulateOdds is run hands 100000 times, and print out its statistics 
//of which all the pairs during the runs

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }
    public static void simulateOdds(){
        int cnt10000 = 10000;
        String sets[]={"A","K","Q","J","10","9","8","7","6","5","4","3","2","no"}; //String of 13 sets
        int cnt_sets[] =new int[14];
        String r; 
        int num[] = new int[5];
        int cnt;
        int i;
        for (cnt=1; cnt<=cnt10000; cnt++)//simulate for 100000 times
        {
            for (i = 0; i<5; i++){
                num[i] = (int) (Math.random()*51); //show hands
     //           System.out.print(num[i]+ " ");
            }
            r = checkPair(num); //when through function to check pairs
            //The retun is a string A, K, Q, J,10... or 1 or no pair
      //      System.out.println(r+ " ");
            for (int j=0 ; j <sets.length;j++)  
            {
                if (r == sets[j])  //compare the return string with set[j]
                    cnt_sets[j]++; //if match, increment the counter for cnt_sets[j]
            }
        }
        //print out statements
        System.out.println("rank   freq of exactly one pair");
        for (i=0; i<13; i++){
            System.out.printf(" %2s   %4d \n",sets[i],cnt_sets[i]);
        }
        System.out.println("----------------------------");
        System.out.println(" total not exactly one pair: "+ cnt_sets[13]);
        
    }
    public static String checkPair(int num[]){ 
        String sets[]={"A","K","Q","J","10","9","8","7","6","5","4","3","2","no"}; //String of 13 sets
        int len,i=0,j=0,com,cnt_same=0, cnt_pair=0;//initialize counters and variable
        boolean ans; //answer
        int pairNum=0;
        len = num.length;
        for (j = 0; j<len-1; j++){
            cnt_same = 0;  //initialize counter in every loop
            com = num[j]%13;  //the number compare with the rest of the array
            for (i = j+1; i<len; i++){ //rest of the array
                if (com == num[i]%13){
                    cnt_same ++;
                    pairNum = num[i];
                    if (cnt_same >1) return "no"; //if cnt_same >1, which means there are a number appeared 3 times, return 3
                }
            }
            if (cnt_same == 1) cnt_pair++; // if a number only repeats itself 2 time, increase counter for counting pairs
            if (cnt_pair >1)
              return "no";  //no means no pairs
        }
        if (cnt_pair == 1){
            return sets[(int)(pairNum%13)]; //if there is a pair, return the set accordingly
        } 
        else return "no";
    }

    public static void showHands(){
        String suits[]={"Clubs","Diamonds","Hearts","Spades"};  //String with 4 types of card
        String sets[]={"A","K","Q","J","10","9","8","7","6","5","4","3","2"}; //String of 13 sets
        String print[][]=new String[4][6];
        for (int cnt = 0; cnt<suits.length; cnt++){
            print[cnt][0]=suits[cnt];
        } //copy the names of types into the print arrray
        int num[]=new int[5];
        int r=0, c=0, index=1,j,z;
        String input;
        Scanner sc = new Scanner(System.in);
        while(true) {
            for (int i = 0; i<5; i++){
                index = 1;
                num[i] = (int) (Math.random()*51);
                r = (int)(num[i]/13);   // r determines what suit the card is
                c = num[i]%13;   //c determines the set of the card (A, K ,Q or ....)
                while (print[r][index] != null)  //checking the next avaliable spot for the 2-d array to store information
                {
                    index++;
                }
                print[r][index]= sets[c];  //put the information to the right place
            }
            //display the array on the console
            for( z = 0; z < 4; z++)
            {
              for( j = 0; j < 6; j++)
              {
                  if (print[z][j]!=null){
                    System.out.print(print[z][j]);
                    if (j == 0) System.out.print(":");
                    else        System.out.print(" ");
                  }
                  else  //if the array is null, increase counter j to end the loop
                    j = 7;
              }
              System.out.println();
            }
            //ask user if they want to run it again
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            input = sc.next();
            //clean up array for next loop use
            for(z = 0; z<4;z++)
            {
                for (j = 1;j<6;j++)
                {
                    print[z][j]=null;
                }
            }
            if (!(input.equals("Y")||input.equals("y")))
                break;
        }
    }
    
}