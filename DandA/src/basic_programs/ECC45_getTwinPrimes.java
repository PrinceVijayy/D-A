package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ECC45_getTwinPrimes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTwinPrimes(2, 25)));
//        System.out.println(getTwinPrimes(121,545));
//        System.out.println(getTwinPrimes(16,547));
    }

    public static int[] getTwinPrimes(int num1,int num2){
        List<Integer> result=new ArrayList<>();
        for(int i=num1;i<=num2;i++){
            if(checkPrime(i)&&checkPrime(i+2)){
                result.add(i);
                result.add(i+2);
            }
        }
        int [] resultArray=new int[result.size()];
        for(int j=0;j<result.size();j++){
            resultArray[j]=result.get(j);
        }
       return resultArray;
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

