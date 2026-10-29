

class Node {
    int data;
    Node Next;
}
class Stack {
    private Node top;
    public Stack() {
        top = null;
    }
    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node();
        newNode.data = value;
        if (isEmpty()) {
            top = newNode;
            return;
        }
        newNode.Next = top;
        top = newNode;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return;
        }
        Node Current = top;
        while (Current != null) {
            System.out.println(" | " + Current.data + " | ");
            Current = Current.Next;
        }
        System.out.println(" |___| \n");
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        top = top.Next;
    }
    public void addlast(int value) {
        Node newNode = new Node();
        newNode.data = value;
        if (isEmpty()) {
            top = newNode;
        }
        Node Current = top;
        while (Current.Next != null) {
            Current = Current.Next;
        }
        Current.Next = newNode;
        newNode.Next = null;
    }
    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        Node Current = top;
        while (Current.Next.Next != null) {
            Current = Current.Next;
        }
        Current.Next = Current.Next.Next;
    }
}
class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.display();
        s.addlast(0);
        s.display();
        s.push(3);
        s.push(4);
        s.display();
        s.removeLast();
        s.display();
    }
}