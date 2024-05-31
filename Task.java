public class Task {
        private String title;
        private String description;
        private boolean completed;

        public Task(String title, String description) {
            this.title = title;
            this.description = description;
            this.completed = false;
        }

    public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public boolean isComplted() {
            return completed;
        }

        public void markComplted() {
            completed = true;
        }

        public String toString() {
            return "Title: " + title + ", Description: " +

                    description + ", Complted: " + completed;
        }
    public Task() {

    }

        public class Node {
            private Task task;
            private Node next;

            public Node(Task task) {
                this.task = task;
                this.next = null;
            }

            public Task getTask() {
                return task;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }

        public class ToDoList {
            private Node head;

            public ToDoList() {
                head = null;
            }

            public void addToDo(Task task) {
                Node newNode = new Node(task);

                if (head == null) {
                    head = newNode;
                } else {
                    Node current = head;
                    while (current.getNext() != null) {
                        current = current.getNext();
                    }
                    current.setNext(newNode);
                }
                System.out.println("Task added: " + task.getTitle());
            }

            public void markToDoAsCompleted(String title) {
                Node current = head;
                while (current != null) {
                    Task task = current.task;
                    if (task.getTitle().equals(title)) {
                        task.markComplted();
                        System.out.println("Task marked as completed: " + task.getTitle());
                        return;
                    }
                    current = current.getNext();
                }
                System.out.println("Task not found: " + title);
            }

            public void viewToDoList() {
                if (head == null) {
                    System.out.println("No tasks in the to-do list.");
                } else {
                    System.out.println("To-Do List:");
                    Node current = head;
                    while (current != null) {
                        Task task = current.task;
                        System.out.println("Title: " + task.getTitle());
                        System.out.println("Description: " + task.getDescription());
                        System.out.println("Completed: " + (task.isComplted() ? "Yes" : "No"));
                        current = current.getNext();
                    }
                }
            }

            public static class Main {
                public static void main(String[] args) {
                    Task.ToDoList toDoList = new Task( ).new ToDoList();
                toDoList.addToDo(new Task("Task 1", "you are student "));
                toDoList.addToDo(new Task("Task 2", "you make me happy "));
                toDoList.addToDo(new Task("Task 3", "you must be sleep "));

                toDoList.markToDoAsCompleted("Task 2");

                toDoList.viewToDoList();
            }
        }



    }}

