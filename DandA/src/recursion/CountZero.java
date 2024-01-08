package recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(10002003,0));
    }
    static int count(int num, int c){
        if (num==0){
            return c;
        }
        if(num%10==0){
           return count(num / 10,++c);
        }
        return count(num / 10,c);
    }
}
