package leetcode_easy;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int i = 0, j = 0; i < haystackArray.length; i++) {
            if (haystackArray[i] == needleArray[j]) {
                if (needleArray.length == j + 1) {
                    return i - needleArray.length+1;
                }
                j++;
            } else if (j > 0) {
                i--;
                j = 0;
            }
        }
        return -1;
    }
}
