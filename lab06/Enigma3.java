/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    System.out.printf("1 n is %d, k is %d\n",n,k);
    if(n*k%12< 12){
      n-=20;
      out+=n;
      System.out.printf("2 n is %d, k is %d\n",n,k);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
          System.out.printf("3 n is %d, k is %d\n",n,k);
    }
    else {
      n=45;
      out+=n+k;
          System.out.printf("4 n is %d, k is %d\n",n,k);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
      default:
        n-=3;
        k-=5;
    }
        System.out.printf("5 n is %d, k is %d\n",n,k);
        if ((n==0)||(k==0))
            System.out.println("Either n or k has o value");
        else
        {
            out+=1/n + 1/k;   
            System.out.println(out);
        }
  }
}

/*
 * Error report:
 * 
 * print all the lines to see 
 * 
 * 
 */

