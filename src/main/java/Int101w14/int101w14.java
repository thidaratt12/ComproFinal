package Int101w14;

import java.util.Arrays;

public class int101w14 {
    public static void main(String[] args) {
        String[] x ={"A", "B","C"};// array ของ String
        String[] y ={null, null, null, null};
        for (int i = 0; i < x.length; i++) {
        y[i] = x[i];
        }
        System.out.println("After copying");
        System.out.println("x: " + Arrays.toString(x));
        System.out.println("y: " + Arrays.toString(y));

        ////
        String y = "ABC";
        int m=3,n =5;
        parameterPassing(y,m,n);
        System.out.println("y =" + y + "m" + m +"n =" + n);
    }
    static void parameterPassing(String x, final int i, double j){
        x += i + j;
        j += i;
        System.out.println("x =" + x + "i" + i +"j =" + j);
    }
}
