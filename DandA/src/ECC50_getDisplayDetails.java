public class ECC50_getDisplayDetails {
    public static void main(String[] args) {

        System.out.println(getDisplayDetails(33, 3.2f));
        System.out.println(getDisplayDetails(130, 20.4f));
    }

    public static String getDisplayDetails(int runs, float overs) {
        int oversBeforePoint = (int) overs;
        int ballsBeforePoint = oversBeforePoint * 6;
        int ballsAfterPoint = (int) (overs * 10) - (oversBeforePoint * 10);
        int balls = ballsBeforePoint + ballsAfterPoint;
        float requiredRunRateInFloat = ((float) runs / (float) balls);
        String requiredRunRatePerBall = String.format("%.2f", requiredRunRateInFloat);
        String requiredRunRatePerOver = String.format("%.2f", requiredRunRateInFloat * 6);
        if (runs < 100 || balls < 100)
            return runs + " runs for " + balls + " balls @ " + requiredRunRatePerBall + "runs per ball";
        else return runs + " runs for " + overs + " overs @ " + requiredRunRatePerOver + "runs per over";

    }
}
