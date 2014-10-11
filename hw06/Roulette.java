//Yuhua Chen
//hw06
//
//
//
//This program simulates a Roulette game
//First the program will ask user for an input between 0 to 37
//then it will run a spin 100 times, 
//if this number comes up at least 3 times, it is a win with profit
//if this number never comes up, it is considered as a lose
//if this number only comes up 1 or 2 times, it is a win with no profit

public class Roulette{
    public static void main(String[] args){
        int repetition = 1000, spins = 100;   //constant 
        int random=0; // random number generated
        int cntSpin=0;  //counter in loop
        int user=0;  //random number generated as user input
        int matchCount=0; //counters
        int cntRep=0, cntLose=0, cntWin=0, cntWith$=0; //counters

        user = (int)(Math.random()*38);
        System.out.println(user);
        while (cntRep<repetition) //repeat for 1000 times
        {
            while (cntSpin<spins)
            {  
                //generate random 100 times, if there is match, matchCounter++
                random = ((int) (Math.random()*38)); //random number from 0 to 37
                if (user == random){
                    matchCount++;   
                }
                cntSpin++; //add counter
            }
            //compute whether this run is a lose or a win
            //cntWin + cntLose = 1000
            if (matchCount>=3)  //if matchCounter>=3, it is a win and win with profit
            {
                cntWith$++;
                cntWin++;
            }
            else if (matchCount == 0) //if match never comes up, it is a lose
                cntLose++;
            else                  //otherwise, it only match 1 and 2 times, it is a win 
                cntWin++;
            //initialize all the counters 
            cntSpin = 0; 
            matchCount = 0;
            cntRep++;
        }
        //print out all the result
        System.out.println("Number of time my number never comes up: " + cntLose);
        System.out.println("Number of time of winning (with or without a profit): "+cntWin);
        System.out.println("Number of times I walk away with a profit- "+cntWith$);



    }
}