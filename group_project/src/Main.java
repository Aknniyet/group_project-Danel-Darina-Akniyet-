import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecisionTree tree = new DecisionTree();
        Node currentNode = tree.getRoot();

        while (!currentNode.isFinal()) {
            System.out.println(currentNode.getQuestion());
            String answer = scanner.nextLine();
            currentNode = currentNode.getNextNode(answer);

            if (currentNode == null) {
                System.out.println("Invalid response. Try again.");
                currentNode = tree.getRoot();
            }
        }

        System.out.println(currentNode.getQuestion());
        scanner.close();
    }
}
