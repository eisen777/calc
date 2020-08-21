import java.util.Scanner;

public class interpreter {
    static void printSolve(String equation) {
        String romPat = "IVX";
        if (romPat.indexOf(equation.charAt(0)) != -1){
            if (equation.contains("-")){
                System.out.println(processor.getSolveRomanianNumsMinus(equation.split(" \\- ")));
            }
            else if (equation.contains("+")){
                System.out.println(processor.getSolveRomanianNumsSum(equation.split(" \\+" )));
            }
            else if (equation.contains("*")){
                System.out.println(processor.getSolveRomanianNumsMult(equation.split(" \\* ")));
            }
            else if (equation.contains("/")){
                System.out.println(processor.getSolveRomanianNumsDiv(equation.split(" \\/ ")));
            }
            else {
                throw new IllegalArgumentException("Invalid data format");

            }

        }
        else {
            if (equation.contains("-")){
                System.out.println(processor.getSolveArabicNumsMinus(equation.split(" \\- ")));
            }
            else if (equation.contains("+")){
                System.out.println(processor.getSolveArabicNumsSum(equation.split(" \\+ ")));
            }
            else if (equation.contains("*")){
                System.out.println(processor.getSolveArabicNumsMult(equation.split(" \\* ")));
            }
            else if (equation.contains("/")){
                System.out.println(processor.getSolveArabicNumsDiv(equation.split(" \\/ ")));
            }
            else {
                throw new IllegalArgumentException("Invalid data format");

            }

        }
    }

}
