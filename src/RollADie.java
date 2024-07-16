/**
 * This class rolls a 6 sided die 20 times using secureRandom
 * @author--Zheng Wang
 */
import java.security.SecureRandom;

public class RollADie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        for (int i = 1; i <= 20; i++) {
            int roll = random.nextInt(6) + 1;
            System.out.printf("%nOn the %d th try you rolled %d",i,roll);
        }
    }
}
