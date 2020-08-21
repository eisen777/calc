import java.util.Scanner;

public class processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        String Input  = scanner.nextLine();
        interpreter.printSolve(Input);
    }


    public static int getSolveArabicNumsSum(String [] nums) {
        if (Integer.valueOf(nums[0]) >= 0 & Integer.valueOf(nums[0]) <= 10 & Integer.valueOf(nums[1]) >= 0 & Integer.valueOf(nums[1]) <= 10 ){
            return Integer.valueOf(nums[0].trim()) + Integer.valueOf(nums[1].trim());
        }
        else {
            throw new IllegalArgumentException("the number must be between 0 and 10");

        }
    }
    public static int getSolveArabicNumsMinus(String [] nums) {
        if (Integer.valueOf(nums[0]) >= 0 & Integer.valueOf(nums[0]) <= 10 & Integer.valueOf(nums[1]) >= 0 & Integer.valueOf(nums[1]) <= 10 ){
            return Integer.valueOf(nums[0].trim()) - Integer.valueOf(nums[1].trim());
        }
        else {
            throw new IllegalArgumentException("the number must be between 0 and 10");
        }
    }
    public static int getSolveArabicNumsMult(String [] nums) {
        if (Integer.valueOf(nums[0]) >= 0 & Integer.valueOf(nums[0]) <= 10 & Integer.valueOf(nums[1]) >= 0 & Integer.valueOf(nums[1]) <= 10 ){
            return Integer.valueOf(nums[0].trim()) * Integer.valueOf(nums[1].trim());
        }
        else {
            throw new IllegalArgumentException("the number must be between 0 and 10");
        }
    }
    public static int getSolveArabicNumsDiv(String [] nums) {
        if (Integer.valueOf(nums[0]) >= 0 & Integer.valueOf(nums[0]) <= 10 & Integer.valueOf(nums[1]) >= 0 & Integer.valueOf(nums[1]) <= 10 ){
            return Integer.valueOf(nums[0].trim()) / Integer.valueOf(nums[1].trim());
        }
        else {
            throw new IllegalArgumentException("the number must be between 0 and 10");
        }
    }

    public static String getSolveRomanianNumsSum(String [] nums) {
        if (romanToArabic(nums[0].trim()) < 0 | romanToArabic(nums[0].trim()) > 10 | romanToArabic(nums[1].trim()) < 0 | romanToArabic(nums[1].trim()) > 10 ){
            throw new IllegalArgumentException("the number must be between 0 and 10");
        }
        else {

            return arabToRoman(romanToArabic(nums[0].trim()) + romanToArabic(nums[1].trim()));
        }
    }
    public static String getSolveRomanianNumsMinus(String [] nums) {
        if (romanToArabic(nums[0].trim()) < 0 | romanToArabic(nums[0].trim()) > 10 | romanToArabic(nums[1].trim()) < 0 | romanToArabic(nums[1].trim()) > 10){
            throw new IllegalArgumentException("the number must be between 0 and 10");

        }
        else {
            return arabToRoman(romanToArabic(nums[0].trim()) - romanToArabic(nums[1].trim()));
        }
    }
    public static String getSolveRomanianNumsMult(String [] nums) {
        if (romanToArabic(nums[0].trim()) < 0 | romanToArabic(nums[0].trim()) > 10 | romanToArabic(nums[1].trim()) < 0 | romanToArabic(nums[1].trim()) > 10){
            throw new IllegalArgumentException("the number must be between 0 and 10");

        }
        else {
            return arabToRoman(romanToArabic(nums[0].trim()) * romanToArabic(nums[1].trim()));
        }

    }
    public static String getSolveRomanianNumsDiv(String [] nums) {
        if (romanToArabic(nums[0].trim()) < 0 | romanToArabic(nums[0].trim()) > 10 | romanToArabic(nums[1].trim()) < 0 | romanToArabic(nums[1].trim()) > 10){

            throw new IllegalArgumentException("the number must be between 0 and 10");

        }
        else {
            return arabToRoman(romanToArabic(nums[0].trim()) / romanToArabic(nums[1].trim()));
        }
    }

    public static String arabToRoman(int num) {
        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String thousands = m[num / 1000];
        String hundereds = c[(num % 1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[num % 10];
        return thousands + hundereds + tens + ones;
    }

    public static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static int romanToArabic(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
                i++;
            }
        }
        return res;
    }
}
