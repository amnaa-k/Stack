class Stack
{
    private int stack[],Top,Size;
    public Stack(){ stack = new int[5];Top = -1;Size = -1;}
    public boolean isEmpty(){return Top == -1;}
    public boolean isFull(){return Size == stack.length-1;}
   
    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }
        if(isEmpty())
        {
            Top++;
            stack[Top] = value;
            Size++;
            return;
        }
        for(int i = Size;i>=0;i--)
        {
            stack[i+1] = stack[i];
        }
        stack[Top] = value;
        Size++;
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow");
            return;
        }
        if(Top==Size)
        {
            stack[Top] = 0;
            Top--;
            Size--;
            return;
        }
        for(int i=0;i<Size;i++)
        {
            stack[i] = stack[i+1];
        }
        stack[Size] = 0;
        Size--;
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow");
            return;
        }
        for(int i=0;i<=Size;i++)
        {
            System.out.println("| "+stack[i]+" |");
        }
        System.out.println("|___|\n");
    }
}
class Main
{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.display();
        s.push(5);
        s.display();
        s.push(4);
        s.display();
        s.push(7);
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
    }
}