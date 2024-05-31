public class Main {
    public static void main(String[] args) {

        Node.linkedList list = new Node().new linkedList();

        list.insertAtPos(10, 1);
        list.insertAtPos(780, 2);
        list.insertAtPos(9830, 3);
        list.deleteAtPosition(2);


        int position = list.searchNode(20);

        Node.Stack stack = new Node().new Stack();


        stack.push(5);
        stack.push(10);


        int poppedData = stack.pop();


        int topElement = stack.peek();

        Node.linkedList.display();
    }
}
    
