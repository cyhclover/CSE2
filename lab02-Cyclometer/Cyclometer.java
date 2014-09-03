//Yuhua Chen
//9/3/2014
//CSE2
//Lab section: Wed

//This program acts as a bicycle cyclometer (meant to measure speed, distance, etc.)
//It records two kinds of data, the time elapsed in seconds, and the number of rotations
//of the front wheel during that time. 
//For two trips, given time and rotation count
//The program will output each trip in miles, as well as the total trip in miles

public class Cyclometer{
// main method for this cyclometer
public static void main(String[] args) {
    
// getting input data
    int secsTrip1=480; // the time elapsed in seconds for the first trip
    int secsTrip2=3220; //the time elapsed in seconds for the second trip
    int countsTrip1=1561; // the number of rotations of the front wheel during 1st trip
    int countsTrip2=9037; //the number of rotations of the front wheel during 2nd trip
    double wheelDiameter=27.0, //diameter of the wheel
    PI=3.14159, //pi 
    feetPerMile=5280, // conversion from feet to mile
    inchesPerFoot=12, // conversion from inch to foot
    secondsPerMinute=60;//conversion from seconds to minute
    double distanceTrip1, distanceTrip2,totalDistance; //used in later calculations
    System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts."); 
    //print the input information for the 1st trip
    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
    //print the input information for the 2nd trip
    
    //run the calculations;
    
    // Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;  //same calculation for trip 2
    totalDistance=distanceTrip1+distanceTrip2;  // sum of the two trips
    //Print out the output data.
    System.out.println("Trip 1 was "+ distanceTrip1 +" miles");
    System.out.println("Trip 2 was "+ distanceTrip2 +" miles");
    System.out.println("The total distance was "+ totalDistance +" miles");
    
    } //end of main method
} //end of class
