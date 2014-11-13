//Yuhua Chen
//lab10

public class MethodCalls{
    public static void main(String [] arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }


    public static int addDigit(int a, int b){
        String combine;
        int output=0;
        combine = ""+Math.abs(b)+Math.abs(a);  //put absolute value a and b into a string
        output = Integer.valueOf(combine);
        if ((a<0)^(b<0))
            output = -output;     //take care of the negative sign
        return output; 
    }
    public static int join(int a, int b)
    { //42,83
        int add=a;
        int digit=0,output=b;
        while ((add*10/10)!=0)
        {
            digit = add%10;
            add/=10;
            output = addDigit(output,digit);
        }
        return output;
    }

}