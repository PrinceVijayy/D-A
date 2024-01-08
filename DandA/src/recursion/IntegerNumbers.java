package recursion;

public class IntegerNumbers {
    public static void main(String[] args) {
        printIntNumbers(10);
    }
    public static void printIntNumbers(int num){
        if(num>0)
         printIntNumbers(num-1);
        System.out.println(num);
    }
}
