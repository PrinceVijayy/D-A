import java.util.Locale;

public class ECC56_getNameScore {
    public static void main(String[] args) {
        System.out.println(getNameScore("dad"));
        System.out.println(getNameScore("DAD"));
        System.out.println(getNameScore("ABC"));
    }
    public  static int getNameScore(String name){

        String aToz="abcdefghijklmnopqrstuvwxyz";
        boolean containsSpecialCharacter=false;
        for(int i=0;i<name.length();i++){
            if(aToz.indexOf(name.toLowerCase().charAt(i))==-1){
                containsSpecialCharacter=true;
            }
        }
        if(containsSpecialCharacter || name.isEmpty()) return -1;
        else{
            int result=0;
            for(int i=0;i<name.length();i++){
                int index=aToz.indexOf(name.toLowerCase().charAt(i));
                  result+=index+1;
            }
            return result;
        }

    }
}
