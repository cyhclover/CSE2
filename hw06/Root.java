//Yuhua Chen
//project2
//This program compute a square root of a positive number
//Start by setting low to 0 and high to 1+x. Obviously the square root 
//lies between low (whose square is less than the square root of x)
//and high (whose square is larger than the square root of x,
//which is not necessarily true, by the way, for high=x). 
//Now take the middle of the interval [low, high] and call it 
//middle. If the square of middle is greater than x, then change
//high to middle; otherwise change low to middle. At this point 
//the square root is still between low and high, but the distance
//between low and high has been halved. Repeat this process until
//the difference between high and low is less than some small 
//multiple of 1+x, say 0.0000001*(1+x).
import java.util.Scanner;

public class Root{
    public static void main(String[] args)
    {
        Scanner sc;
        sc = new Scanner(System.in);
        double root=0;
        double high=0, low = 0, median=0;
        double t = 0.0000001, tolerance = 0;
        double x=0, guess = 0;
        while (true){
            System.out.print("Enter a positive number: ");
            if (sc.hasNextDouble())
            {
                x = sc.nextDouble();
                if (x<=0)
                {  //if it a negative number
                    System.out.println("You did not enter a number greater than 0");
                }
                else
                {
                    high = 1+x;  //set high and tolerance
                    tolerance = t*(1+x);
                    while ((high-low)>(tolerance))  //execute the loop until high-low < tolerance
                    {
                        median = (high + low)/2;  //get median
                        guess = median*median;
                        if (guess>x)   //if guess is greater than x
                            high = median;  //change median to high
                        else
                            low = median;   //change median to low
                    }
                    median = (high+low)/2;  //get median as the final result
                    System.out.println(high-low);
                    System.out.println(tolerance);
                    //print out result
                    System.out.println("Square root of "+ x + " is " + median);
                    break;
                }
            }
            else
            {
                System.out.println("You did not enter a number");
                sc.next();
            }

        }
    }
}