
public class test{
    public static void main(String args[]){
        int i = 10;
        while( true ){
            
            System.out.println("i: " + i--);
            if( i < 0 )
                { break; }
        }
    }
}