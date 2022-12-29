package recursion;

public class AddNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(addNaturalNumber(10));
    }
    static int addNaturalNumber(int n){
        if(n==1){
            return 1;
        }else{
            return n+addNaturalNumber(n-1);
        }
    }
}

