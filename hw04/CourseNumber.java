//Yuhua Chen
//homework 4 program 3
//
//
//This program reads in a 6 digit number, makes sure that it 
//adheres to the above description, and then prints out the 
//semester and year
//
////////////////////////////////////////////////////////////

import java.util.Scanner;

public class CourseNumber{
    public static void main(String[] args)
    {
        final int upperLimit = 201440; //range
        final int lowerLimit = 186510; //range
        int sixDigit;
        int year;
        int courseInfo;
        String semester;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter a six digit number giving the course semester: ");
        if (sc.hasNextInt())
        {
            sixDigit = sc.nextInt();
            if ((sixDigit<lowerLimit)||(sixDigit>upperLimit)) //check range of the 6 digit
            {
                System.out.println("The number was outside the range ["+lowerLimit
                    +","+upperLimit+"]");
                return;
            }
        }
        else
        {
            System.out.println("You did not enter an int");
            return;
        }
        year = sixDigit/100;  //year information
        courseInfo = sixDigit%100;  //semester information
        //get semester info
        //10 spring, 20 summer 1, 30 summer 2, and 40 fall
        if (courseInfo == 10) semester = "Spring";
        else if (courseInfo == 20) semester = "Summer 1";
        else if (courseInfo == 30) semester = "Summer 2";
        else if (courseInfo == 40) semester = "Fall";
        else semester = "wrong info";
        //print out information
        if (semester.equals("wrong info"))
            System.out.println(courseInfo + " is not a legitimate semester");
        else
            System.out.println("The course was offered in the "+ semester + " of " +year);
        
    }
}