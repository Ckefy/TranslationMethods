package generator.subclasses;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    public List<String> items = new ArrayList<>();
    public List<String> parameters = new ArrayList<>();
    public List<String> actions = new ArrayList<>();

    public void addItem(String s, String parameter, String action) {
        items.add(s);
        parameters.add(parameter);
        actions.add(action);
    }
}
