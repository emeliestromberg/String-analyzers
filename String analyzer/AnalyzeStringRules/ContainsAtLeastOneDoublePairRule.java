package AnalyzeStringRules;

public class ContainsAtLeastOneDoublePairRule implements IRule {

    public ContainsAtLeastOneDoublePairRule() {
    }

    public boolean isApplicable(String input) {

        int numberOfDoublePairs = 0;

        for (int index = 0; index < input.length() - 1; index++) {
            if (input.charAt(index) == input.charAt(index + 1)) {
                numberOfDoublePairs++;
            }
        }

        if (numberOfDoublePairs >= 1) {
            return (true);
        } else {
            return (false);
        }

    }
}