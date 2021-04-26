package pl.raga;

public class Main {
    public static void main(String[] args) {
        System.out.println("The app is running");

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        node1.value = 1;
        node2.value = 2;
        node3.value = 3;
        node4.value = 4;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.showElements(node1);

    }
}
