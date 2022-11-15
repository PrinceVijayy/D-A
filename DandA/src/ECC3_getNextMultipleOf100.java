import java.util.Scanner;

public class ECC3_getNextMultipleOf100 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to find it's next multiple of 100");
    int num=sc.nextInt();
    System.out.println(getNextMultipleOf100(num));
    System.out.println(getNextMultipleOf100(145));
    System.out.println(getNextMultipleOf100(0));
    System.out.println(getNextMultipleOf100(-44));
  }

  public static int getNextMultipleOf100(int num){
    if(num<=0){
      return -1;
    }else{
      num=num/100;
      return num*100+100;
    }
  }
}
