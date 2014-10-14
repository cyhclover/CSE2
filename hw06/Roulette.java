//Yuhua Chen
//hw06
//
//
//
//This program simulates a Roulette game
//First the program will generate a random number called user for an input between 0 to 37
//then it will run a spin 100 times, 
//if this number comes up at least 3 times, it is a win with profit
//if this number never comes up, it is considered as a lose
//if this number only comes up 1 or 2 times, it is a win with no profit
//At the end, it will display the total of lose, the total of winning, and the number
//of times the program walk away with a profit

public class Roulette{
    public static void main(String[] args){
        int repetition = 1000, spins = 100;   //constant 
        int random=0; // random number generated
        int cntSpin=0;  //counter in loop
        int user=0;  //random number generated as user input
        int matchCount=0; //counters
        int cntRep=0, cntLose=0, cntWith$=0; //counters
        int winningPerMatch$ = 36;
        int totalWinning$ = 0;
        while (cntRep<repetition) //repeat for 1000 times
        {
            user = (int)(Math.random()*38); //generate a number 
            while (cntSpin<spins)
            {  
                //generate random 100 times, if there is match, matchCounter++
                random = ((int) (Math.random()*38)); //random number from 0 to 37
                if (user == random){
                    matchCount++;   
                    totalWinning$ += winningPerMatch$;
                }
                cntSpin++; //add counter
            }
            //compute whether this run is a lose or a win
            //cntWin + cntLose = 1000
            if (matchCount>=3)  //if matchCounter>=3, it is a win and win with profit
            {
                cntWith$++;
            }
            else if (matchCount == 0) //if match never comes up, it is a lose
                cntLose++;
            //initialize all the counters 
            cntSpin = 0; 
            matchCount = 0;
            cntRep++;
        }
        //print out all the result
        System.out.println("Number of time my number never comes up: " + cntLose);
        System.out.println("Total winnings: "+ totalWinning$);
        System.out.println("Number of times I walk away with a profit: "+cntWith$);



    }
}