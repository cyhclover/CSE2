//Yuhua Chen
//lab09

import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+ a +" and "+b+" is "+larger(a,b));
	System.out.println("The larger of " + a +", "+b+", and "+c+ " is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
  public static int larger(int a,int b){
      if (a<b)
        return b;
      else
        return a;
  }
  public static boolean ascending(int i1, int i2, int i3){
      if ((i1<=i2)&&(i2<=i3))
        return true;
      else
        return false;
  }
  public static int getInt(Scanner sc){
      int input;
      System.out.print("Enter three ints:");
      while (true)
      {
          if (sc.hasNextInt())
          {
              input = sc.nextInt();
              return input;
          }
          else
          {
              System.out.print(" did not enter an int; try again- ");
              sc.next();
          }
      }
  }
}
 
