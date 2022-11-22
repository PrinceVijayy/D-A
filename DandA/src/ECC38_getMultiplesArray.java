import java.util.Arrays;

public class ECC38_getMultiplesArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMultiplesArray(10)));
    }
    public static int[] getMultiplesArray(int number){
        if(number<=0) return null;
        else {
            int [] result= new int [number];
            for(int i=0,j=1;i<number;i++,j++){
                result[i]=number*j;
            }
            return result;
        }
    }
}
