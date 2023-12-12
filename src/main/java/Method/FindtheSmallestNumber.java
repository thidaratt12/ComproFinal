package Method;
import java.util.Scanner;
public class FindtheSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your first number :");
        double x = sc.nextDouble();
        System.out.println("Input your second number :");
        double y = sc.nextDouble();
        System.out.println("Input your third number :");
        double z = sc.nextDouble();
        System.out.println("The smallest value is " + smallest(x, y, z)  );
    }

    public static double smallest(double x , double y , double z){
        return Math.min(Math.min(x,y),z);
    }
}
