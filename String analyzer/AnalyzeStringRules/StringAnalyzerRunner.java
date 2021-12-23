package AnalyzeStringRules;

import java.util.ArrayList;

public class StringAnalyzerRunner {
    public static void main(String[] args) {

        String input = AskForAString.stringInput();

        ContainsAtLeastThreeDsRule atLeastThreeDsRule = new ContainsAtLeastThreeDsRule();
        boolean containsThreeDs = atLeastThreeDsRule.isApplicable(input);
        System.out.println("\nThere are three or more D:s in the string: " + containsThreeDs);

        ContainsAtLeastThreeVowelsRule atLeastThreeVowelsRule = new ContainsAtLeastThreeVowelsRule();
        boolean containsThreeVowels = atLeastThreeVowelsRule.isApplicable(input);
        System.out.println("There are three or more vowels in the string: " + containsThreeVowels);

        ContainsNoForbiddenPairRule noForbiddenPairRule = new ContainsNoForbiddenPairRule();
        boolean containsNoForbiddenPair = noForbiddenPairRule.isApplicable(input);
        System.out.println("There is no forbidden pair in the string: " + containsNoForbiddenPair);

        ContainsAtLeastOneDoublePairRule atLeastOneDoublePairRule = new ContainsAtLeastOneDoublePairRule();
        boolean containsDoubles = atLeastOneDoublePairRule.isApplicable(input);
        System.out.println("There is one or more double pair of a letter: " + containsDoubles + "\n");

        ArrayList<IRule> rules = new ArrayList<IRule>();
        rules.add(new ContainsAtLeastThreeDsRule());
        rules.add(new ContainsAtLeastThreeVowelsRule());
        rules.add(new ContainsNoForbiddenPairRule());
        rules.add(new ContainsAtLeastOneDoublePairRule());

        boolean isApplicableToAllRules = true;
        for (IRule rule : rules) {
            if (!rule.isApplicable(input)) {
                isApplicableToAllRules = false;
            }
        }

        System.out.println("\nThe string follows all four rules: " + isApplicableToAllRules + "\n");
    }
}