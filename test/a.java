import java.util.Scanner;
public class a{

	public static void main( String args[] ){
		int i,j;
		int[] arr = {1,2,3,4};
		haha(arr);
		for (int u: arr) {
  			System.out.println(u);
		}
	}
	public static void haha(int[] a){
		a[0] = 4;
		a[1] = 3;
	}
}