package AnalyzeStringRules;

public class ContainsNoForbiddenPairRule implements IRule {

    public ContainsNoForbiddenPairRule() {

    }

    public boolean isApplicable(String input) {

        String forbidden1 = "ab";
        String forbidden2 = "cd";
        String forbidden3 = "pq";
        String forbidden4 = "xy";

        if (input.contains(forbidden1)) {
            return (false);
        } else if (input.contains(forbidden2)) {
            return (false);
        } else if (input.contains(forbidden3)) {
            return (false);
        } else if (input.contains(forbidden4)) {
            return (false);
        } else {
            return (true);
        }
    }
}
/*
 * case("ab") switch (key) { case value:
 * 
 * break;
 * 
 * default: break; }
 * 
 */