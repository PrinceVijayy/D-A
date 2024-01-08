package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
    static int reverse(int num){
        if(num==0){
            return 0;
        }
        return (num%10)*10 + reverse(num/10);
    }
}
