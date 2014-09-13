//Yuhua Chen
//hw03
//program1

import java.util.Scanner; //importing Scanner Class

//the program prompts the user to enter two digits, 
//the first giving the number of counts on a cyclometer and
//the second giving the number of seconds during which the counts occurred,
//and then an then prints out the distance traveled and the average miles per hour.
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Bicycle {
    public static void main(String[] args){
    Scanner sc; //declare
    sc = new Scanner(System.in);
    //asking user for input
    System.out.print("Enter the number of seconds: ");
    double seconds = sc.nextDouble(); //number of seconds during which the count occurred
    System.out.print("Enter the number of counts:  ");
    int counts = sc.nextInt(); //number of counts on a cyclometer

    //known values
    int diameter=27;
    int feetPerMile=5280,
    inchesPerFoot = 12,
    secondsPerMinute = 60,
    minutesPerHour = 60;
    //variables to be calculated
    double PI = 3.1415926;
    double timeInMin;
    double dstInMiles;
    double mph;
    //start calculation from input
    dstInMiles = counts*diameter*PI/(feetPerMile*inchesPerFoot); //calculate distance in miles
    timeInMin = seconds/secondsPerMinute;  //convert seconds to minutes
    mph = dstInMiles/(timeInMin/minutesPerHour);  //mileage per 
    //change dstInmiles and mph with only two decimal points
    dstInMiles = (double)((int)(dstInMiles*100))/100;
    mph = (double)((int)(mph*100))/100;
    timeInMin = (double)((int)(timeInMin*10))/10;
    //printing outputs
    System.out.println("The distance was "+dstInMiles+" miles and took " 
        + timeInMin +" minutes");
    System.out.println("The average mph was " + mph);
    
    }
}