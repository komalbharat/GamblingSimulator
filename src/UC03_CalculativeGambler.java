public class UC03_CalculativeGambler {
    static int BET =1;

    public static void main(String[] args) {
        System.out.printf(" Welcome The Gambling Game \n ");
        int betAmount = 100;
        while (betAmount >50 &&betAmount<150){
            int out =(int) (Math.random()*2);
            if(out ==1){
                System.out.printf(" You Won The Game ");
                betAmount = betAmount + BET;
                System.out.printf(" Your Balance is "+ betAmount + "\n");
            }
            else {
                System.out.printf(" You Lost the Game ");
                betAmount = betAmount - BET;
                System.out.printf(" Your Balance is " +betAmount+"\n");
            return;
            }}
    }

}
