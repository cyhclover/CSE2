//Yuhua Chen
//lab07


import java.util.Scanner;

public class LoopTheLoop{
    public static void main(String[] args)
    {
        int nStars = -1, count = 0,n=0;
        String userInput;
        Scanner sc;
        sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter an int between 1 and 15: ");
            if (sc.hasNextInt())
            {
                nStars = sc.nextInt();
                if((nStars>=1)&&(nStars<=15))
                {
                    while (count<nStars)
                    {
                        System.out.print("*");
                        count++;
                    }
                    count = 0;
                    System.out.println("");
                    while (count<nStars)
                    {
                        while (n<=count)
                        {
                            System.out.print("*");
                            n++;
                        }
                        System.out.println("");
                        count++;
                        n = 0;
                    }
                    System.out.print("Enter y or Y to run again- ");
                    userInput = sc.next();
                    if (!(userInput.equals("Y")||userInput.equals("y")))
                        break;
                    else
                        count = 0;
                }
                else{
                    System.out.println("Your int was not in the range [1.15]");
                }
            }
            else
            {
                sc.next();
            }

        }
        
    }
}