import java.util.Scanner;

public class ECC8_oddRounder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to find the odd rounder");
        int num=sc.nextInt();
        System.out.println(oddRounder(num));
        sc.close();
    }
    public  static int oddRounder(int num){
        if(num<0){
            return -1;
        } else if (num==0) {
            return -2;
        }else if(num%2==0){
            return num;
        }else{
            num=(num/10)*10+10;
            return num;
        }
    }
}
