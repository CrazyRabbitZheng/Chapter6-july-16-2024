/**
 * This class roll a 6 sided die 60M times and calculate each face's probability.
 *<pre>
 * Counter 1: 10000014
 * Counter 1: 10000015
 * Counter 1: 10000016
 * Counter 1: 10000017
 * Probability for 1 is 0.17
 * Probability for 2 is 0.17
 * Probability for 3 is 0.17
 * Probability for 4 is 0.17
 * Probability for 5 is 0.17
 * Probability for 6 is 0.17
 *</pre>
 * @author--Zheng Wang
 */
import java.security.SecureRandom;

public class SecureRandomTestor {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;

        for (int i = 1; i < 60_000_000; i++) {//The _ in the big numbers is for readability
            int r = sr.nextInt(6) + 1;

            switch (r) {
                case 1:
                    counter1++;
                    System.out.println("Counter 1: " + counter1);//60M is a big number and it takes many seconds to run the loop and show the result.
                    //sout above is to show that the program is running.
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;
                case 6:
                    counter6++;
            }
        }

        System.out.printf("Probability for 1 is %.2f%n", (double)counter1 / 60_000_000.0);
        System.out.printf("Probability for 2 is %.2f%n", (double)counter2 / 60_000_000.0);
        System.out.printf("Probability for 3 is %.2f%n", (double)counter3 / 60_000_000.0);
        System.out.printf("Probability for 4 is %.2f%n", (double)counter4 / 60_000_000.0);
        System.out.printf("Probability for 5 is %.2f%n", (double)counter5 / 60_000_000.0);
        System.out.printf("Probability for 6 is %.2f%n", (double)counter6 / 60_000_000.0);
    }
}
