package recursion;

public class ProductNumbers {
    public static void main(String[] args) {
        System.out.println(product(4));
    }
    static int product(int num){
        if(num==1){
            return num;
        }
        return product(num-1)*num;
    }
}
