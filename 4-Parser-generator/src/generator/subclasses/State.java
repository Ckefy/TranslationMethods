package generator.subclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class State {
    private String name;
    private List<String> parameters = new ArrayList<>();
    private List<String> returns = new ArrayList<>();
    public List<Rule> rules = new ArrayList<>();
    private Set<String> first = new HashSet<>();
    private Set<String> follow = new HashSet<>();
    private boolean hasEpsilon = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addParameter(String type, String name) {
        String res = type + " " + name;
        parameters.add(res);
    }

    public void addReturn(String type, String name) {
        String res = type + " " + name;
        returns.add(res);
    }

    public void addRule(Rule r) {
        rules.add(r);
        if (r.items.size() == 1 && r.items.get(0).equals("EPS")) {
            hasEpsilon = true;
        }
    }

    public Set<String> getFirst() {
        return first;
    }

    public boolean addToFirst(String item) {
        if (item.equals("EPS")) {
            hasEpsilon = true;
        }
        if (first.contains(item)) {
            return false;
        }
        return first.add(item);
    }

    public boolean hasEpsilon() {
        return hasEpsilon;
    }

    public boolean addToFollow(String item) {
        if (follow.contains(item)) {
            return false;
        }
        return follow.add(item);
    }

    public Set<String> getFollow() {
        return follow;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public List<String> getReturns() {
        return returns;
    }
}
