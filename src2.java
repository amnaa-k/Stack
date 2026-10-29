class Node
{
    int data;
    Node Next;
}
class Stack
{
    private Node Top;
    public Stack(){Top = null;}
    public boolean isEmpty(){return Top==null;}
   
    public void push(int value)
    {
        Node newNode = new Node();
        newNode.data = value;
        if(isEmpty())
        {
            Top = newNode;
            return;
        }
        newNode.Next = Top;
        Top = newNode;
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow");
            return;
        }
        Node Current = Top;
        while(Current != null)
        {
            System.out.println("|"+Current.data+" |");
            Current = Current.Next;
        }
        System.out.println("|___|\n");
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow");
            return;
        }
        Top = Top.Next;
    }
}
class Main
{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(12);
        s.push(51);
        s.display();
        s.pop();
        s.display();
       
        s.pop();
        s.display();
       
        s.pop();
        s.display();

    }
}