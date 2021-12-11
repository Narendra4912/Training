package StackPackage;

public class MainClass {

    public static void main(String[] args) {

        StackOperations stackOperations = new StackOperations();

        LinkedList firstNode = new LinkedList(70);
        LinkedList secondNode = new LinkedList(30);
        LinkedList thirdNode = new LinkedList(56);
        LinkedList forthNode = new LinkedList(20);


        stackOperations.push(firstNode);
        stackOperations.push(secondNode);
        stackOperations.push(thirdNode);
        stackOperations.push(forthNode);

        stackOperations.printStack();

        System.out.println("\nAfter POP Operation \n");
        stackOperations.pop();
        stackOperations.pop();

        stackOperations.printStack();

    }
}
