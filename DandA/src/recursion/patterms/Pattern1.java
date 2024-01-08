package recursion.patterms;

/**
 * #####
 * #####
 * #####
 * #####
 */
public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5,0);
    }
    private static void pattern1(int rows, int columns){
        if(rows==0){
            return;
        }
        if(columns<rows){
            System.out.print("#");
            pattern1(rows,columns+1);

        }else {
            System.out.println();
            pattern1(rows-1,0);
        }
    }
    /*private static void pattern1(int rows, int columns){
        if(rows==0){
            return;
        }
        if(columns==0){
            rows--;
            columns=rows;
            System.out.println();
        }else {
            columns--;
        }
        System.out.print("#");
        pattern1(rows,columns);
    }*/
}
