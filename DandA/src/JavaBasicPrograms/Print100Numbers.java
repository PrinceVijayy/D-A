package JavaBasicPrograms;

public class Print100Numbers {
    public static void main(String[] args) {

        System.out.println("Printing prime numbers between 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for (int i=2; i<num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
