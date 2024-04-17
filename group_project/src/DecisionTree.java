public class DecisionTree {
    private Node root;

    public DecisionTree() {
        buildTree();
    }

    private void buildTree() {

        root = new Node("Do you exercise regularly?");
        Node yesNode = new Node("Do you feel any pain during exercise?");
        yesNode.addBranch("yes", new Node("Consult a doctor before continuing your routine."));
        yesNode.addBranch("no", new Node("Keep up the good work and maintain your routine!"));

        Node noNode = new Node("Do you think your diet is balanced??");
        noNode.addBranch("yes", new Node("You are on a good path with your diet. Adding regular exercise would further enhance your health."));
        noNode.addBranch("no", new Node("Now let's work on bringing your diet into balance with more fruits, vegetables, and whole grains. Also, consider starting with light exercise routines"));

        root.addBranch("yes", yesNode);
        root.addBranch("no", noNode);
    }

    public Node getRoot() {
        return root;
    }
}
