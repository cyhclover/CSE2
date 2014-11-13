//Yuhua Chen
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
  }
    public static double[] addArrays(double[] x,double[] z){
        int len_short, len_long,i;
        char c;
        if (x.length>z.length) 
        {
            len_short = z.length;
            len_long = x.length;
            c = 'x';
        }
        else
        {
            len_short=x.length;
            len_long =z.length;
            c = 'z';
        }
        double [] returnArray = new double[len_long];
        for (i = 0; i<len_short; i++){
            returnArray[i] = x[i]+z[i];
        }
        if (c == 'z')
        {
            for (i =len_short; i<len_long;i++){
                returnArray[i]=z[i];
            }
        }
        else
        {
            for (i =len_short; i<len_long;i++){
                returnArray[i]=x[i];
            }
        }
        return returnArray;
    }
    public static boolean equals(double [] x, double [] y){
        int len= x.length,i;
        if (len==y.length) 
        {
            for (i = 0; i<len; i++){
                if (x[i] != y[i])
                    return false;
            }
            return true;
        }
        else
            return false;  //length is not the same, no way it will equal
        
    }
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
