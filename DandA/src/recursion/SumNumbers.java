package recursion;

public class SumNumbers {
    public static void main(String[] args) {
        System.out.println(sum(12345));

    }
    static int sum(int num){
        if (num==0){
            return num;
        }
        return (num%10)+ sum(num/10);
    }
}
