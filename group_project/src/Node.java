import java.util.HashMap;
import java.util.Map;

public class Node {
    private String question;
    private Map<String, Node> children;

    public Node(String question) {
        this.question = question;
        this.children = new HashMap<>();
    }

    public void addBranch(String answer, Node child) {
        children.put(answer, child);
    }

    public Node getNextNode(String answer) {
        return children.get(answer);
    }

    public String getQuestion() {
        return question;
    }

    public boolean isFinal() {
        return children.isEmpty();
    }
}
