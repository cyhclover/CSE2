//Yuhua Chen
//homework 4 program 4
//
//
//This program asks user enter an positive integer giving the number of 
//seconds that have passed during the day and then displays the time 
//in conventional form.
//
//
//////////////////////////////////////////////////
import java.util.Scanner;

public class TimePadding{
    public static void main(String[] args){
        final int secondInMinute = 60;
        final int secondInHour = 3600;
        int rawSeconds; //raw data from user input
        int second;
        int minute;
        int hour;
        String sec; //string for storing second information
        String min; //string for storing min information
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter the time in seconds: ");
        if (sc.hasNextInt())
        {
            rawSeconds = sc.nextInt();
            if (rawSeconds<0){
                System.out.print("You did not enter a positive int");
                return;
            }
        }
        else
        {
            System.out.println("You did not enter an integer");
            return;
        }
        //seperate second hour and minute information from user's input
        second = rawSeconds%secondInMinute; 
        hour = rawSeconds/secondInHour;
        minute = (rawSeconds - second - hour*secondInHour)/secondInMinute;
        //if second and minute are less than 10, put a 0 in the front
        if (second<10)
            sec = "0" + Integer.toString(second);
            //use string to store second information 
            // because int cannot print 1 as 01
        else    
            sec = Integer.toString(second);
        if (minute<10)
            min = "0" + Integer.toString(minute);
        else    
            min = Integer.toString(minute);
            
        //print out the final output
        System.out.println(hour+":"+min+":"+sec);
        
    }
}