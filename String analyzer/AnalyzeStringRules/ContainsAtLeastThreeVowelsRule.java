package AnalyzeStringRules;

public class ContainsAtLeastThreeVowelsRule implements IRule {

    public ContainsAtLeastThreeVowelsRule() {

    }

    public boolean isApplicable(String input) {

        int numberOfVowels = 0;
        String vowels = "aeiouy";

        for (String s : input.split("")) {
            if (vowels.contains(s)) {
                numberOfVowels++;
            }
        }

        if (numberOfVowels >= 3) {
            return (true);
        } else {
            return (false);
        }
    }
}
