/**
 * This class takes in three double type inputs
 * prints the maximum number.
 * I had an error in maximum method, stating "can't return anything in a void method" -- cause: I typed the method inside of the static main method.
 * @author--Zheng Wang
 */
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 numbers in type double, separated by space:  ");
        double firstNumber = in.nextDouble();
        double secondNumber = in.nextDouble();
        double thirdNumber = in.nextDouble();

        double result = maximum(firstNumber,secondNumber,thirdNumber);

        System.out.println("The maximum number is " + result);
    }

    public static double maximum(double a, double b, double c){
        //上面，因为用maximum这个method的时候不用create an object，所以这个method是static
        //因为用这个method的时候需要return 一个double的值，所以return type是double
        double max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

}