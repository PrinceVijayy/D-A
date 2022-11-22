import java.util.Scanner;

public class ECC14_ringAlarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to alarm should ring or not");
        System.out.println("Enter a number where");
        System.out.println("Sun=0, Mon=1, Tue=2,Wed=3, Thur=4,Fri=5,Sat=6");

        int week = sc.nextInt();
        System.out.println("Enter weather you are in vacation or not?");
        System.out.println("Input type is true or false");
        boolean onVacationOrNot = sc.nextBoolean();

        System.out.println(ringAlarm(week, onVacationOrNot));
        sc.close();
    }

    public static String ringAlarm(int week, boolean onVacationOrNot) {
        if (week < 0 || week > 6) {
            return "Invalid Inputs";
        } else if (week >= 1 && week <= 5 && onVacationOrNot) {
            return "10:00";
        } else if (week >= 1 && week <= 5 && !onVacationOrNot) {
            return "7:00";
        } else if (week == 0 || week == 6 && onVacationOrNot) {
            return "OFF";
        } else {
            return "10:00";
        }

    }
}
