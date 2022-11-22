package Assignment;

public class ECC26_checkArmStrong {
    public static void main(String[] args) {
        System.out.println(checkArmStrong(2356));
        System.out.println(checkArmStrong(1425));
        System.out.println(checkArmStrong(9474));
    }

    public static String checkArmStrong(int num) {
        if (num < 0) return "-1";
        else {
            int dummy=num;
            int result = 0;
            while (num > 0) {
                int reminder = num % 10;
                result+=reminder*reminder*reminder*reminder;
                num/=10;
            }
            if(result==dummy) return "ArmStrong Number";
            else return "Not ArmStrong Number";
        }
    }
}
