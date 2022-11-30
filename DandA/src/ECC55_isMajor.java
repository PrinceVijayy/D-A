import java.util.Scanner;

public class ECC55_isMajor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if you are major or not");
        System.out.println(
                """
                Select your gender :
                1. Male
                2. Female
                """
        );
        int gender= sc.nextInt();
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        System.out.println("major : "+isMajor(gender,age));
    }
    public  static  boolean isMajor(int gender,int age){
        if(gender==1){
            return age >= 21;
        }else if(gender==2){
            return age >= 18;
        }
        return false;
    }
}
