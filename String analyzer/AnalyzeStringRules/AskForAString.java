package AnalyzeStringRules;

import java.util.Scanner;

public class AskForAString {

    static String stringInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHello! Please enter a string of letters for me to analyze.\n");
        String input = scanner.nextLine();

        return input;
    }
}
