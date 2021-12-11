package QueuePackage;

public class MainQueueClass {

    public static void main(String[] args) {

        QueueOperations queueOperations = new QueueOperations();

        LinkedListForQueue firstNode = new LinkedListForQueue(56);
        LinkedListForQueue secondNode = new LinkedListForQueue(30);
        LinkedListForQueue thirdNode = new LinkedListForQueue(70);
        LinkedListForQueue fourthNode = new LinkedListForQueue(80);


        queueOperations.push(firstNode);
        queueOperations.push(secondNode);
        queueOperations.push(thirdNode);
        queueOperations.push(fourthNode);

        queueOperations.printQueue();

        queueOperations.pop();
        System.out.println("After Pop Operation =>");
        queueOperations.printQueue();
    }
}
