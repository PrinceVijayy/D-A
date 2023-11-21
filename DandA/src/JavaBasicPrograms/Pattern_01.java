package JavaBasicPrograms;

/**
 *         *
 *        **
 *       ***
 *      ****
 *
 *       *
 *      * *
 *     * * *
 *    * * * *
 *
 */
public class Pattern_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) { // 2
            for (int j = 1; j <= 4; j++) {//2
                if(j>=i){
                    System.out.print(" *");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
