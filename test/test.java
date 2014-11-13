
public class test{
    public static void main(String args[]){
        int i = 0,j=0;
        int cnt = 0;
        for (i=0;i<=9;i++){
            if (i<=4) cnt = i+1;
            if (i>4) cnt = 10-i;
            for (j=1;j<=cnt; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}