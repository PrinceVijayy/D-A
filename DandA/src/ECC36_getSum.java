public class ECC36_getSum {
    public static void main(String[] args) {
        System.out.println(getSum(2,4));
    }
    public static String getSum(int num1,int num2){
        if(num1<=0 || num2<=0) return "Error";
        else return String.valueOf(num1+num2);
    }
}
