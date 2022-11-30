public class ECC54_decrypt {
    public static void main(String[] args) {
        System.out.println(decrypt("srrznerqzb"));
    }
    public static String decrypt(String str){
        String result="";
        String aToz="abcdefghijklmnopqrstuvwxyz";
        String zToa="zyxwvutsrqponmlkjihgfedcba";
        boolean strContainsNumber=false;
        for(int i=0;i<str.length();i++){
            if(aToz.indexOf(str.charAt(i))==-1){
                strContainsNumber=true;
            }
        }
        if(strContainsNumber) return null;
        else{
            for(int i=0;i<str.length();i++){
                int dummy=aToz.indexOf(str.charAt(i));
                result+=zToa.charAt(dummy);
            }
        }
        return result;
    }
}
