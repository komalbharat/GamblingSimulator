public class UC_02_BetWinOrLoss {
    static int BET=1;

    public static void main(String[] args) {
        System.out.println(" Welcome to Gambling Game ");

            int out = (int) (Math.random() * 2);
            if (out == BET) { // player will win when the value is one
                System.out.println("You won the game");
            } else {
                System.out.println(" You lost the game ");

            }

        }
    }

