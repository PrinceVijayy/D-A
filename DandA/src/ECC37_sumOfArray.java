public class ECC37_sumOfArray {
    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1, 0, -2, 4}));
    }
    public static int sumOfArray(int num[]){
        int result=0;
        if(num.length==0) return -1;
        else{
            for (int data:num) {
                if(data<0){
                    return -2;
                }else result+=data;
            }
        }
        return result;
    }
}
