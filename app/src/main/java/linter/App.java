/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> missingSemicolonLineNumber =readFile("C:\\Users\\aseel\\Desktop\\asac\\401\\java-fundamentals\\app\\src\\main\\java\\linter\\app\\src\\main\\resources\\gates.js");

        for (int lineNum: missingSemicolonLineNumber) {
            System.out.println("Line " + lineNum + " : Missing semicolon.");
        }

    }

    public static ArrayList<Integer> readFile(String path){
        Map<Integer, String> gatesFileLines = new HashMap<>();
        ArrayList<Integer> missingSemicolonLineNumber = new ArrayList<>();
        int numOfLines = 1;

        try {
            Scanner gatesFile = null;
            gatesFile = new Scanner(new File("C:\\Users\\aseel\\Desktop\\asac\\401\\java-fundamentals\\app\\src\\main\\java\\linter\\app\\src\\main\\resources\\gates.js"));
            while (gatesFile.hasNextLine()) {
                gatesFileLines.put(numOfLines, gatesFile.nextLine());
                numOfLines++;
            }

            for (Map.Entry lineOfCode : gatesFileLines.entrySet()) {
                int lineNum = (int) lineOfCode.getKey();
                String lineValue = (String) lineOfCode.getValue();
//                System.out.println(lineNum + " : " + lineValue);
                if (!((lineValue == null || lineValue.contains("{") || lineValue.contains("}") || lineValue.contains("if") || lineValue.contains("else")) && !(lineValue.contains("return") && !lineValue.contains(";")))) {
                    missingSemicolonLineNumber.add(lineNum);
                }
            }
            gatesFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        return missingSemicolonLineNumber;
    }
}
