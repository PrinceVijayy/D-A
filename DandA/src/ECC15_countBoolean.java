import java.util.Scanner;

public class ECC15_countBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number to find boolean value");
        System.out.println("Enter first boolean");
        boolean b1=sc.nextBoolean();
        System.out.println("Enter second boolean");
        boolean b2=sc.nextBoolean();
        System.out.println("Enter third boolean");
        boolean b3=sc.nextBoolean();
        System.out.println(countBoolean(b1, b2, b3));
    }
    public static boolean countBoolean(boolean b1, boolean b2, boolean b3){
        if(b1 &&b2&&b3) return true;
        else if(b1 && b2&&!b3) return true;
        if(b1 &&!b2&&!b3) return false;
        return false;
    }
}
