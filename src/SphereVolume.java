/**
 * This class takes a double radius, prints the volume of a sphere.
 * @author--Zheng Wang
 */
import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere :");
        double radius = in.nextDouble();

        double volume = sphereVolume(radius);
        System.out.printf("Volume of sphere with a radius of %.2f is %.2f ",radius,volume);
    }

    public static double sphereVolume(double radius) {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }
}
