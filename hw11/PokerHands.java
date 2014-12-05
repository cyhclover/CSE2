//Yuhua Chen
//Wed Lab

import java.util.Scanner;
import java.util.Arrays;
public class PokerHands{
    public static void main(String[] args){
        int cntShowHands = 5;
        Scanner sc = new Scanner(System.in);
        int cardInfo[] = {-1,-1,-1,-1,-1};
        String face[] = {"c","d","h","s"};
        String sets[]={"a","k","q","j","10","9","8","7","6","5","4","3","2"}; //String of 13 sets
        String userInput,infoface, infoSet;
        while(true)
        {
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand-");
            userInput = sc.next();
            if (!((userInput.equals("y")) ||userInput.equals("Y")))
                return;  //terminate the program
            else
            {
                for (int i=0; i<cntShowHands; i++)
                {
                    infoface = enterface(sc);
                    infoSet = enterSet(sc);
                    cardInfo[i] = find(face,infoface)*13+find(sets,infoSet);
                    if (find(cardInfo,cardInfo[i])!=i)
                    {
                        System.out.println("You already entered that card");
                        i--;
                    }
                }
                showOneHand(cardInfo);
                check(cardInfo);
            }
        }
    }
    public static void check(int[] arr)
    {
        int i,index;
        int[] suitInfo = new int[5];
        int[] faceInfo = new int[13];
        int[] straight = {1,1,1,1,1};
        Arrays.fill(suitInfo,0);
        Arrays.fill(faceInfo,0);
        for (i=0;i<5;i++)   //frequency information about suits
        {
            index = arr[i]/13;
            suitInfo[index] ++;
        }
        Arrays.sort(suitInfo);
        for (i=0;i<5;i++)//frequency information about face
        {
            index = arr[i]%13;
            faceInfo[index]++;
        }
    index = find(faceInfo,1); //where does 1 start in the array;
    if (find(suitInfo,5)!=-1)  //if flush
        if (Arrays.equals(Arrays.copyOfRange(faceInfo,0,5),straight)) //loyal flush
        {
            System.out.println("Loyal flush");
            return;
        }
        else if (Arrays.equals(Arrays.copyOfRange(faceInfo,index,index+5),straight)) 
        {    System.out.println("Straight flush");
            return;
        }
        else{
            System.out.println("flush");
            return;
        }
    
    if (Arrays.equals(Arrays.copyOfRange(faceInfo,index,index+5),straight)){
        System.out.println("Straight");
        return;}
    //checking faceInfo
    Arrays.sort(faceInfo);
    System.out.println(Arrays.toString(faceInfo));
    if (faceInfo[12]==4){
        System.out.println("Four of a kind");
        return;}
    else if ((faceInfo[12]==3)&&(faceInfo[11]==2)){
        System.out.println("Full House");return;}
    else if ((faceInfo[12]==3)&&(faceInfo[11]==1)&&(faceInfo[10]==1)){
        System.out.println("Three Pair");return;}
    else if ((faceInfo[12]==2)&&(faceInfo[11]==2)&&(faceInfo[10]==1)){
    System.out.println("Two Pair");return;}
    else if ((faceInfo[12]==2)&&(faceInfo[11]==1)&&(faceInfo[10]==1)&&(faceInfo[9]==1)){
        System.out.println("One Pair");return;}

    System.out.println("High Card");
        

    }
     public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={ "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ", "4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=face[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
  
    public static String enterface(Scanner sc){
        String user;
        while (true)
        {
            System.out.print("Enter the face:'c', 'd', 'h', or 's'-");
            user = sc.next();
            switch (user)
            {
                case "c":case"d":case"h":case"s":
                    return user;
                default:
                    System.out.println("You did not enter a valid response");
            }
        }
    }
    public static String enterSet(Scanner sc){
        String user;
        while (true)
        {
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            user = sc.next();
            switch (user)
            {
                case "a":case"k":case"q":case"j": case "10": case"9": case"8":
                case "7":case"6":case"5":case"4":case"3":case"2":
                    return user;
                default:
                    System.out.println("You did not enter a valid response");
            }
        }
    }
    public static int find(String[] array, String value) {
        for(int i=0; i<array.length; i++) {
             if(array[i].equals(value))
                 return i;
        }
        return -1;
    }
    public static int find(int[] array, int value) {
        for(int i=0; i<array.length; i++) {
             if(array[i] == value)
                 return i;
        }
        return -1;
    }
}