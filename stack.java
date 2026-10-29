class Stack {
    private int stack[], top, size;
    public Stack() {
        stack = new int[5];
        top = -1;
        size = -1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return size == stack.length-1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        if (isEmpty()) {
            top++;
            stack[top] = value;
            size++;
            return;
        }
        for (int i = size; i >= 0; i--) {
            stack [i+1] = stack[i];
        }
        stack[top] = value;
        size++;
    } 
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        if (top == size) {
            stack[top] = 0;
            top--;
            size--;
            return;
        }
        for (int i = 0; i < size; i++) {
            stack[i] = stack[i+1];
        }
        stack[size] = 0;
        size--;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <= size; i++) {
            System.out.println(" | " + stack[i] + " | ");
        }
        System.out.println(" |___|");
    }
}
class main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.display();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        s.pop();
        s.pop();
        s.display();
        s.push(1);
        s.display();
    }
}