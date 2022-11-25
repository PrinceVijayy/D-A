package Assignment;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ECC44_getTwinPrimes {
    public static void main(String[] args) {
        System.out.println(getTwinPrimes(2,25));
//        System.out.println(getTwinPrimes(121,545));
//        System.out.println(getTwinPrimes(16,547));
    }

    public static int[] getTwinPrimes(int num1,int num2){
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=num1;i<=num2;i++){
            if(checkPrime(i)) arr.add(i);
        }
        for(int j=0;j<arr.size();j++){
            if(arr.get(j+1)-arr.get(j)==2){
                result.add(arr.get(j));
                result.add(arr.get(j+1));
            }
        }
       int [] a=result.stream().map(i->i).forEach(i->a[i]);
        return result;
    }


    public static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

