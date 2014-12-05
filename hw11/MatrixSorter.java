//Yuhua Chen
//3d sorting program
import java.util.Arrays;
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   public static void sort(int[][] mat2d){
       //selection sort  
        for (int i=0; i<mat2d.length;i++){
            selectionSort(mat2d[i]);
        }
        //insertion sort
        insertionSort(mat2d);
   }
    public static void insertionSort(int[][] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key[] = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i][0] > key[0] ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    public static void selectionSort(int[] arr){
        int index;
        for (int i = 0; i < arr.length - 1; i++)
        {
            index =i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
            int smallerNumber =  arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    public static int findMin(int[][][] mat3d){
        int i,j,z;
        int min=99; //worst min value
        i=mat3d.length;
        for (int cnti=0; cnti<i;cnti++){
            j = mat3d[cnti].length;  //get length
            for (int cntj=0;cntj<j;cntj++){
                z = mat3d[cnti][cntj].length;  //get length
                for (int cntz=0;cntz<z;cntz++){
                    if ((mat3d[cnti][cntj][cntz])<min){  //compare the min
                        min = mat3d[cnti][cntj][cntz];
                    }
                }
            }
        }
        return min;
        
    }
    public static void show(int[][][] mat3d){
        int i,j,z;
        i=mat3d.length;
        for (int cnti=0; cnti<i;cnti++){
            System.out.printf("---------------------------Slab %d\n",cnti+1);
            j = mat3d[cnti].length;  //get length
            for (int cntj=0;cntj<j;cntj++){
                z = mat3d[cnti][cntj].length;  //get length
                for (int cntz=0;cntz<z;cntz++){
                    System.out.printf("%3d",mat3d[cnti][cntj][cntz]);
                }
                System.out.println();
            }
        }
    }
    public static int[][][] buildMat3d(){
       int s=3;
       int mat3d[][][] = new int[s][][];
       //constructing 3d matrix
       for (int i= 0; i<s;i++){
            mat3d[i] = new int[2*i+3][];
            for (int j = 0;j<2*i+3;j++){
                mat3d[i][j] = new int[i+j+1];
                for (int z= 0; z<1+i+j;z++){
                    mat3d[i][j][z]=(int)(Math.random()*99+1);
                }
            }
       }
       return mat3d;
   }
}