package string_programs;

import java.util.ArrayList;
import java.util.Arrays;

public class MathInString {
    public static void main(String[] args) {
        System.out.println(solve_in_the_brackets("5*55+8+7-66"));
    }

    public static double solve_in_the_brackets(String str) {
        String arr_operators = "+-*/%";
        String[] str_arr = str.split("");
        ArrayList<String> arrayList = new ArrayList<>();
        String numberString = "";
        boolean exists = true;
        for (String s : str_arr) {


            numberString += s;

        }
        System.out.println(arrayList);
        return 1;
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) {
        return a - b;
    }
}
