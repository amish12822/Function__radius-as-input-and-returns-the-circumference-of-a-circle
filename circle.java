import java.util.Scanner;

/**
 * circle
 */
public class circle {

    public static double Circumference(float n){

        double cir = 2 * 3.14 * n;

        return cir;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Circle Radius = ");float n = sc.nextFloat();

        System.out.println("Circumference of Circle is " + Circumference(n));
    
    }
}