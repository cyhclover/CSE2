//Yuhua Chen
//check wether a 10 int set have duplicates or have excatly one duplicates
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];  //initialize array
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }  //ask for input
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){  //cehck if it has duplicates
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){  //check if it has exactly one duplicates
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
    public static boolean exactlyOneDup(int num[]){ 
        int len,i=0,j=0,com,cnt_same=0, cnt_pair=0;//initialize counters and variable
        boolean ans; //answer
        len = num.length;
        for (j = 0; j<len-1; j++){
            cnt_same = 0;  //initialize counter in every loop
            com = num[j];  //the number compare with the rest of the array
            for (i = j+1; i<len; i++){ //rest of the array
                if (com == num[i]){
                    cnt_same ++;
                    if (cnt_same >1) return false; //if cnt_same >1, which means there are a number appeared 3 times, return 3
                }
            }
            if (cnt_same == 1) cnt_pair++; // if a number only repeats itself 2 time, increase counter for counting pairs
            if (cnt_pair >1)
              return false;  //return false if there is more than one pairs
        }
        if (cnt_pair == 1) return true;
        else return false;

    }
    public static boolean hasDups(int num[]){
        int len,i=0,j=0,com,cnt_same=0, cnt_pair=0;
        boolean ans; //answer
        len = num.length;
        for (j = 0; j<len-1; j++){
            cnt_same = 0;
            com = num[j];
            for (i = j+1; i<len; i++){
                if (com == num[i]){
                    cnt_same ++;  //counting repetitions.
                }
            }
            if (cnt_same >= 1)
              cnt_pair ++;
        }
        if (cnt_pair >= 1) return true; //if there is one or more pairs, return true
        else return false;

    }
  public static String listArray(int num[]){  //print array in as a string output;
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}
