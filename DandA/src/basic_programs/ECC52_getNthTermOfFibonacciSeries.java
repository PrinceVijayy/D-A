package basic_programs;

public class ECC52_getNthTermOfFibonacciSeries {
    public static void main(String[] args) {
        System.out.println(getFibonacciSeries(40));
        System.out.println(getFibonacciSeries(1));
        System.out.println(getFibonacciSeries(2));
        System.out.println(getFibonacciSeries(3));
        System.out.println(getFibonacciSeries(0));
    }

    public static int getFibonacciSeries(int num) {
        if (num <= 0) return -1;
        else {
            int result = 0;
            if (num == 1) result = 0;
            else if (num==2) result= 1;
            else {
                int temp;
                for (int i = 2, j = 0, k = 1; i < num; i++) {
                    temp=k;
                    k=j+k;
                    j=temp;
                    result=k;
                }
            }
            return result;
        }
    }
}
