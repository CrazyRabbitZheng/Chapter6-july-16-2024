/**
 * This class using enum type to simulate Craps game.
 * !!!!I don't understand enum well.
 * May get back later.
 *
 */
import java.security.SecureRandom;

public class CrapsWithEnum {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum States {CONTINUE,WON,LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        States gameState;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SNAKE_EYES:
                case TREY:
            case BOX_CARS:
                gameState = States.LOST;
                break;
                case SEVEN:
                    case YO_LEVEN:
                        gameState = States.WON;
                        break;
            default:
                gameState = States.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
        }

        while (gameState == States.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) {
                gameState = States.WON;
                System.out.println("Player won!");
            }else {
                if (sumOfDice == SNAKE_EYES) {//here isn't sumOFDice == 7 clearer? Why enum?

                    gameState = States.LOST;
                    System.out.println("Player lost!");
                }
            }

        }

    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die1;

        System.out.printf("Player rolled %d + %d = %d%n",die1,die2,sum);
        return sum;
    }
}
