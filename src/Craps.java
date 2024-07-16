/**
 * This class simulates game Craps
 * Craps rules: one throw your throw 2 dice, sum the 2 numbers you get
 * if your first throw is 7 or 11, you win
 * if the first throw is 2, 3, or 12, you lose. the house win
 * the rest sums are called points
 * you throw again, if you got the same sum as your point, you win
 * if you throw a sum of 7 after the first throw, you lose
 * //怎么样都要掷一次色子，用do while loop
 * @author--Zheng Wang
 */
import java.security.SecureRandom;

public class Craps {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int sum = 0;
        boolean endGame = false;
        boolean notFirstThrow = false;
        int point = 0;
        boolean hasPoint = false;

        do {
            int die1 = random.nextInt(6) + 1;
            System.out.println("your first die is " + die1);
            int die2 = random.nextInt(6) + 1;
            System.out.println("your second die is " + die2);
            sum = die1 + die2;
            System.out.println("You got a sum of " + sum);
            if ((sum == 7 || sum == 11) && !notFirstThrow) {
                System.out.println("You win!");
                endGame = true;
            } else if ((sum == 2 || sum == 3 || sum == 12) && !notFirstThrow) {
                System.out.println("Craps! -- You lose!");
                endGame = true;
            } else if (sum == point && hasPoint) {
                System.out.println("You win!");
                endGame = true;
            } else if (sum == 7 && hasPoint) {
                System.out.println("You lose!");
                endGame = true;
            }else {
                if(!hasPoint){
                    point = sum;
                }
                System.out.printf("your point is %1$d. Throw again and you win by getting a sum of %d again.\n", point);
                notFirstThrow = true;
                hasPoint = true;
            }
        }while(!endGame);

    }
}
