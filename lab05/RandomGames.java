//Yuhua Chen
//lab05
//
//
import java.util.Scanner;

public class RandomGames{
    public static void main(String[] args){
        String a; //user input
        int crap1, crap2,crapSum; //random int assigned for craps case
        int p; //random int assign for pick a card
        int pType; //random int assign for type of the card
        int r; //random int assign for Roulette case
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card:");
        a = sc.next();

        if (a.length()!= 1)
        {
            System.out.println("a single character expected");
            return;
        }
        switch (a){
            case "c": case "C":
                crap1 = ((int)(Math.random()*10) % 6) + 1;
                crap2 = ((int)(Math.random()*10) % 6) + 1;
                crapSum = crap1+crap2;
                System.out.println("Crap: "+crap1+" + "+crap2+" = "+crapSum);
                break;
            case "r": case "R":
                r = ((int)(Math.random()*100)%38);  //random number from 0 to 37
                if (r == 37){  // if it is 37, assign it to 00
                    System.out.println("Roulette: 00");
                    break;
                }
                else
                {
                    System.out.println("Roulette:"+r);
                    break;
                }
            case "p": case "P":
                System.out.println("Picking a card not implemented yet");
                break;
            default:
                System.out.println("Not valid input");
        }
            
            
        
    }
}