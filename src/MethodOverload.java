/**
 * This class demonstrates method overloading
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.3  is %f%n", square(7.3));//%f has 6 decimal places in the fraction part, if not specified.
    }
//below is method overloading --- similar methods with same name, but different signatures.
    public static int square(int intValue) {
        System.out.printf("Method square is invoked with int value %d%n ",intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.printf("Method square is invoked with double value %f%n ",doubleValue);
        return doubleValue * doubleValue;
    }
}
