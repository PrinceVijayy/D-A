package recursion.strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        rem("askjjfhsaa",'a',ans,0);
        System.out.println(ans);
    }
    private static String rem(String str,char c, StringBuilder ans,int start){
        if (c!=str.charAt(start)){
            ans.append(str.charAt(start));
        }
        if (str.length()==1){
            return str;
        }
        return rem(str.substring(start+1),c,ans,start);
    }
}
