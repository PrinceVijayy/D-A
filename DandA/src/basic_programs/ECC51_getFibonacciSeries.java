package basic_programs;

public class ECC51_getFibonacciSeries {
    public static void main(String[] args) {
        System.out.println(getFibonacciSeries(40));
        System.out.println(getFibonacciSeries(1));
        System.out.println(getFibonacciSeries(2));
        System.out.println(getFibonacciSeries(3));
        System.out.println(getFibonacciSeries(0));
    }

    public static String getFibonacciSeries(int num) {
        if (num <= 0) return null;
        else if (num > 90) return "enter a value between 1 to 90";
        else {
            String result = "";
            if (num == 1) result += 0 ;
            else if (num==2) result+= 0+", "+1;
            else {
                result += 0 + ", "+1+", ";
                int temp;
                for (int i = 2, j = 0, k = 1; i < num; i++) {
                    result+=j+k+", ";
                    temp=k;
                    k=j+k;
                    j=temp;
                }
            }
            return result;
        }
    }
}
