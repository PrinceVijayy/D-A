package recursion;

public class FibanocciSeries {
    public static void main(String[] args) {
        System.out.println(printFibanocciSeries(50));;
    }

    public static int printFibanocciSeries(int num) {
        if (num<2)
            return num;
     return printFibanocciSeries(num - 2) + printFibanocciSeries(num - 1);
    }
}
