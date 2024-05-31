public class Node {
    int data;
    Node next;

    public Node() {
        this.data = data;
        this.next = null;
    }

    public class linkedList {
        Node head;

        public static void display() {
        }

        public void insertAtPos(int data, int position) {
            Node newNode = new Node();
            if (position == 1) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                int count = 1;
                while ((current != null && count < position - 1)) {
                    current = current.next;
                    count++;
                }
                if (current != null) {
                    newNode.next = current.next;
                    current.next = newNode;
                } else {
                    System.out.println("insert at invalid position ");
                }
            }
        }

        public void deleteAtPosition(int position) {
            if (position == 1) {
                if (head != null) {
                    head = head.next;
                } else {
                    System.out.println("empty list ");
                }
            } else {
                Node current = head;
                int count = 1;

                while (current != null && count < position - 1) {
                    current = current.next;
                    count++;
                }

                if (current != null && current.next != null) {
                    current.next = current.next.next;
                } else {
                    System.out.println("Invalid position");
                }
            }
        }

        public void deleteAfterNode(Node node) {
            if (node != null && node.next != null) {
                node.next = node.next.next;
            } else {
                System.out.println("Invalid node or no node after it");
            }
        }

        public int searchNode(int value) {
            Node current = head;
            int position = 1;
            while (current != null) {
                if (current.data == value) {
                    return position;
                }
                current = current.next;
                position++;
            }

            return -1;
        }
    }

    class Stack {
        Node head;

        public void push(int data) {
            Node newNode = new Node();

            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public int pop() {
            if (head != null) {
                int poppedData = head.data;
                head = head.next;
                return poppedData;
            } else {
                System.out.println("empty");
                return -1;
            }
        }

        public int peek() {
            if (head != null) {
                return head.data;
            } else {
                System.out.println("empty");
                return -1;
            }
        }

    }}
