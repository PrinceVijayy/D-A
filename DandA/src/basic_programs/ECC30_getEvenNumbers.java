package basic_programs;

public class ECC30_getEvenNumbers {
    public static void main(String[] args) {
        System.out.println(getEvenNumbers(10, 20));
        System.out.println(getEvenNumbers(20,10));
    }
    public static String getEvenNumbers(int num1, int num2) {
        if (num1 < 0 || num2 < 0) return "-1";
        else if (num1 == 0 || num2 == 0) return "-2";
        else {
            int start, end;
            StringBuilder str = new StringBuilder();
            if (num1 < num2) {
                start = num1;
                end = num2;
            } else {
                start = num2;
                end = num1;
            }
            for(int i=start;i<=end;i++){
                if(i%2==0){
                    str.append(i).append(" ");
                }
            }
            return String.valueOf(str);
        }
    }
}
