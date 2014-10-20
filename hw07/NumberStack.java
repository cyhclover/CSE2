//Yuhua Chen
//hw07
//This program prints nested loops in three different ways

import java.util.Scanner;

public class NumberStack{
    public static void main(String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        //declare counters
        int input=0, cntNum = 0, cntWrite=0, cntLine=0;
        int charPerLine=0, cntSpace=0, end =0, start=0;
        boolean dash=false;
        while(true)
        {
            System.out.print("Enter a number between 1 and 9- ");
            //check if an int is entered
            if (!sc.hasNextInt()){
                System.out.println("You did not enter an int! ");
                sc.next();
            }
            else
            {
                input = sc.nextInt();
                //check if the int is within the range
                if ((input<1)||(input>9)){
                    System.out.println("You did not enter a number between 1 and 9!");
                }
                else
                {   //for loop strategy
                    System.out.println("Using for loop:");
                    charPerLine=2*input-1;  //number of characters per line
                    for (cntNum=1; cntNum<=input;cntNum++) //counting 1 to input
                    {
                        dash = false; 
                        for (cntLine = 1; cntLine<=cntNum+1; cntLine++)
                        {
                            if (cntLine == cntNum+1)  //detect if the program needs to print - 
                                dash = true;
                            for (cntWrite = 1; cntWrite<=charPerLine+1; cntWrite++)
                            {
                                start = (input - cntNum)+1;  //start print number 
                                end = charPerLine - (input-cntNum)+1;  //stop print number
                                if (cntWrite < start)
                                    System.out.print(" ");  //if cntWrite <start, print space
                                else if (cntWrite<end)  // if cntWrite>start and <end, print number or dash accordingly
                                {
                                    if (dash == false)  //boolean dash determines wether number or dash is printed
                                        System.out.print(cntNum);
                                    else
                                        System.out.print("-");
                                }
                                else{
                                    System.out.println();  // if cntWrite>end, stop printing, and make cntWrite charPerline+1 to terminate the sub loop
                                    cntWrite = charPerLine+1;
                                }
                            }
                        }
                    }
                    //while loops
                    System.out.println("While loop: ");
                    //initialize counters
                    cntNum = 1; cntWrite=1; cntLine=0;
                    cntSpace=0;
                    while(cntNum<=input)
                    {   
                        cntLine =0;
                        start = (input - cntNum)+1;  //start print number 
                        end = charPerLine - (input-cntNum)+1;  //stop print number
                        while (cntLine<=cntNum)
                        {   
                            while(cntWrite<start)  //printing space
                            {
                                cntWrite++;
                                System.out.print(" ");
                            }
                            while(cntWrite<end)   //printing character or dash
                            {
                                cntWrite++;
                                if (cntLine == cntNum)
                                    System.out.print("-");
                                else
                                    System.out.print(cntNum);
                            }
                            System.out.println();
                            cntLine++;
                            //initialize counter
                            cntWrite =1;
                        }
                            cntNum++;
                    }
                    //do while loops
                    System.out.println("Do-While loop: ");
                    //initialize counters
                    cntNum = 1; cntWrite=1; cntLine=0;
                    cntSpace=0;
                    do
                    {   dash = false;
                        cntLine =0;
                        start = (input - cntNum)+1;  //start print number 
                        end = charPerLine - (input-cntNum)+1;  //stop print number
                        do 
                        {   
                            do  //printing space
                            {
                                if (cntWrite<start)
                                    System.out.print(" ");
                                cntWrite++;
                            } while (cntWrite<=start);
                            do   //printing character or dash
                            {
                                cntWrite++;
                                if (cntLine == cntNum)
                                    System.out.print("-");
                                else
                                    System.out.print(cntNum);
                            }while (cntWrite<=end);
                            System.out.println();
                            cntLine++;
                            //initialize counter
                            cntWrite =1;
                        } while (cntLine<=cntNum);
                            cntNum++;
                    }while(cntNum<=input);
                    break;
                }
            }    
        }
    }
}