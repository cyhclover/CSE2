//Yuhua Chen
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        int num[] = new int[10];
        System.out.print("Enter 10 ints- ");
        int i,low=0,high=0,sum =0;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i<10; i++){
            num[i]=sc.nextInt();
        }
        for (i = 0;i<10;i++){
            sum += num[i];
            if (num[i]>high)
                high = num[i];
            if (num[i]<low)
                low = num[i];
        }
        System.out.println("The lowest entry is  "+ low);
        System.out.println("The highest entry is "+ high);
        System.out.println("The sum is "+sum);
        for (i = 0; i<10;i++){
            System.out.printf("%5d%7d\n",num[i],num[9-i]);
        }
        
    }
}