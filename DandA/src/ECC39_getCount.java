

public class ECC39_getCount {
    public static void main(String[] args) {
        System.out.println(getCount(new int[]{1,4,56,4},4));
    }
    public static int getCount(int arr[],int number){
        if(arr.length==0) return -1;
        else {
            int  count=0;
            for(int i=0;i<arr.length;i++){
               if(arr[i]==number){
                   count++;
               }
            }
            return count;
        }

    }
}
