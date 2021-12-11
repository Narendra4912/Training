package QueuePackage;

public class QueueOperations {

    INode front = null, rear = null;

    public void push(INode newNode) {

        if(front == null && rear == null)
        {
            front = rear = newNode;
            front.setNext(null);
            rear.setNext(null);
        }
        else if(front.getNext() == null)
        {
            rear = newNode;
            front.setNext(rear);
        }
        else
        {
            INode tempNode = rear;
            rear = newNode;
            tempNode.setNext(rear);
        }
    }

    public void printQueue()
    {
        INode tempNode = front;
        while (tempNode.getNext() != null)
        {
            if(tempNode == front) {
                System.out.println(tempNode.getData() + " <= Front");
                tempNode = tempNode.getNext();
            }
            else
            {
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNext();
            }
        }
        if(tempNode == rear)
            System.out.println(tempNode.getData() + " <= Rear");

    }

    public void pop() {
        front = front.getNext();
    }
}
