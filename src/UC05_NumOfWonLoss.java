public class UC05_NumOfWonLoss {
    static int BET =1;
    static int STAKE = 100;
    static int loss =0;
    static int win =0;

    static int Day = 1;
    public static void main(String[] args) {
        System.out.printf(" Welcome The Gambling Game \n ");
        int wholeAmount = 100;
        while (wholeAmount > 50 && wholeAmount < 150) {

            int out = (int) (Math.random() * 2);
            if (out == 1) {
                wholeAmount = wholeAmount + BET;
            } else {
                wholeAmount = wholeAmount - BET;
            }
            int max = wholeAmount;
            Day++;

            System.out.println("The number of time played are ");
            System.out.println("Total amount in hand " + wholeAmount + " on day " + Day);
            if (max > 100) {
                win++;
                System.out.println(" Number of time Win this match in this month " + win);
                return;

            } else {
                loss++;
                System.out.println(" Number of loss this match in this month " + loss);
            }

        }
    }
}

