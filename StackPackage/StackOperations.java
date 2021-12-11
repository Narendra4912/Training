package StackPackage;

public class StackOperations {

    INode top = null;

    public void push(LinkedList newNode)
    {
        if(top == null)
        {
            top = newNode;
        }
        else
        {
            INode tempNode = top;
            top = newNode;
            top.setNext(tempNode);
        }
    }

    public void printStack()
    {
        INode tempNode = top;
        while (tempNode.getNext() != null)
        {
            if(tempNode == top)
            {
                System.out.println(tempNode.getData()+" <= TOP");
            }
            else
            {
                System.out.println(tempNode.getData());
            }
            tempNode = tempNode.getNext();
        }
        System.out.println(tempNode.getData());
    }

    public void pop() {
        top = top.getNext();
    }
}
