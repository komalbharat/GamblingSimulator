public class UC_04_TwentyDaysOfPlaying {
    static int BET =1;
    static int STAKE = 100;
    static  int playedGame = 0;
    static int Day = 1;
    public static void main(String[] args) {
        System.out.printf(" Welcome The Gambling Game \n ");
            int wholeAmount = 100;
            while (wholeAmount > 50 && wholeAmount < 150) {
                playedGame++;
                int out = (int) (Math.random() * 2);
                if (out == 1) {
                    wholeAmount = wholeAmount + BET;
                } else {
                    wholeAmount = wholeAmount - BET;
                }
                int max = wholeAmount;
                Day++;

                System.out.println("The number of time played are " + playedGame);
                System.out.println("Total amount in hand " + wholeAmount + " on day " + Day);
                if (max > 100) {
                    System.out.println("You won with 50$");
                    return;

                } else {
                    System.out.println("You lost with 50%");
                }

            }
        }
    }

