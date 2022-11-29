public class ECC50_getDisplayDetails {
    public static void main(String[] args) {
        System.out.println(getDisplayDetails(33,3.2f));
    }
    public static String getDisplayDetails(int runs,float overs){
        String result="";
        int balls=0;
        int oversBeforePoint=(int)overs;
        int ballsBeforePoint=oversBeforePoint*6;
        int ballsAfterPoint=(int)(overs*10)-(oversBeforePoint*10);
        int ballForGivenOvers= ballsBeforePoint+ballsAfterPoint;
        float runRateInFloatFormat=((float)runs/(float)ballForGivenOvers);
        String runRateFormated=String.format("%.1f",runRateInFloatFormat);
        System.out.println(runRateFormated);
        return result;
    }
}
