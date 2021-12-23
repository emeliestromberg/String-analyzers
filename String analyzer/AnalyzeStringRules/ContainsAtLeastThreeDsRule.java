package AnalyzeStringRules;

public class ContainsAtLeastThreeDsRule implements IRule {

    public ContainsAtLeastThreeDsRule() {

    }

    public boolean isApplicable(String input) {

        int numberOfDs = 0;

        for (char c : input.toCharArray()) {
            if (c == 'd') {
                numberOfDs++;
            }
        }
        if (numberOfDs >= 3) {
            return (true);
        } else {
            return (false);
        }
    }
}