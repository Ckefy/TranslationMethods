package generator;

import generator.atoms.*;

import java.util.*;

public class Grammar {
    String grammarName;
    String startState;
    Map<String, TokensHolder> tokenHolders = new HashMap<>();
    Map<String, State> states = new HashMap<>();
    List<TokensHolder> tokens = new ArrayList<>();
    List<TokensHolder> skipTokens = new ArrayList<>();
    List<String> imports = new ArrayList<>();

    public void addImport(String s) {
        imports.add(s);
    }

    public void setName(String s) {
        grammarName = s;
    }

    public void setStartState(String s) {
        startState = s;
    }

    public void addToken(String tokenName, String pattern) {
        TokensHolder item = new TokensHolder(tokenName, pattern);
        tokens.add(item);
        if (tokenHolders.containsKey(tokenName)) {
            System.err.println("Token with such name already exist");
            System.exit(-1);
        }
        tokenHolders.put(tokenName, item);
    }

    public void addSkipToken(String tokenName, String pattern) {
        TokensHolder item = new TokensHolder(tokenName, pattern);
        skipTokens.add(item);
        if (tokenHolders.containsKey(tokenName)) {
            System.err.println("Token with such name already exist");
            System.exit(-1);
        }
        tokenHolders.put(tokenName, item);
    }

    public void addState(State s) {
        states.put(s.getName(), s);
    }

    void constructFirst() {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (State state : states.values()) {
                for (Rule rule : state.rules) {
                    for (String item : rule.items) {
                        if (item.equals("EPS")) {
                            if (state.addToFirst(item)) {
                                changed = true;
                            }
                        } else if (tokenHolders.containsKey(item)) {
                            if (state.addToFirst(item)) {
                                changed = true;
                            }
                            break;
                        } else if (states.containsKey(item)) {
                            State st = states.get(item);
                            for (String newItem : st.getFirst()) {
                                if (state.addToFirst(newItem)) {
                                    changed = true;
                                }
                            }
                            if (!st.hasEpsilon()) {
                                break;
                            }
                        } else {
                            System.err.println("Unknown state name in " + state.getName() + ".");
                            System.exit(-1);
                        }
                    }
                }
            }
        }
    }

    void constructFollow() {
        State start = states.get(startState);
        start.addToFollow("_END");
        boolean changed = true;
        while (changed) {
            changed = false;
            for (State state : states.values()) {
                for (Rule rule : state.rules) {
                    Set<String> curGammaFirst = new HashSet<>();
                    curGammaFirst.add("_END");
                    for (int i = rule.items.size() - 1; i >= 0; --i) {
                        String item = rule.items.get(i);
                        if (item.equals("EPS")) {
                            curGammaFirst.add("EPS");
                            continue;
                        }
                        if (tokenHolders.containsKey(item)) {
                            curGammaFirst.clear();
                            curGammaFirst.add(item);
                            continue;
                        }
                        if (states.containsKey(item)) {
                            State st = states.get(item);
                            for (String s : curGammaFirst) {
                                if (!s.equals("EPS")) {
                                    if (st.addToFollow(s)) {
                                        changed = true;
                                    }
                                }
                            }
                            if (curGammaFirst.contains("_END")) {
                                for (String s : state.getFollow()) {
                                    if (st.addToFollow(s)) {
                                        changed = true;
                                    }
                                }
                            }
                            if (!st.hasEpsilon()) {
                                curGammaFirst.clear();
                            }
                            curGammaFirst.addAll(st.getFirst());
                        } else {
                            System.err.println("Unknown state name " + item + " in " + state.getName() + ".");
                            System.exit(-1);
                        }
                    }
                }
            }
        }
    }

    HashSet<String> firstForRule(Rule r) {
        HashSet<String> first = new HashSet<>();
        for (String item : r.items) {
            if (item.equals("EPS")) {
                first.add("EPS");
            } else if (tokenHolders.containsKey(item)) {
                first.add(item);
                break;
            } else if (states.containsKey(item)) {
                first.addAll(states.get(item).getFirst());
                if (!first.contains("EPS")) {
                    break;
                }
            }
        }
        return first;
    }

    /*public void showTokens() {
        System.out.println(grammarName);
        System.out.println("TOKENS");
        for (TokensHolder item : tokens) {
            System.out.printf("Key: %s  Value: %s \n", item.name, item.pattern);
        }
        System.out.println("SKIP TOKENS");
        for (TokensHolder item : skipTokens) {
            System.out.printf("Key: %s  Value: %s \n", item.name, item.pattern);
        }
    }*/

    /*void showFirst() {
        System.out.println("---FIRST---");
        for (State state : states.values()) {
            System.out.println(state.getName() + " : " + state.getFirst().toString());
        }
    }*/

    /*void showFollow() {
        System.out.println("---FOLLOW---");
        for (State state : states.values()) {
            System.out.println(state.getName() + " : " + state.getFollow().toString());
        }
    }*/
}
