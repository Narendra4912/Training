package QueuePackage;

public class LinkedListForQueue<K> implements INode {

    K data;
    INode next = null;

    public LinkedListForQueue(K data) {
        this.data = data;
    }

    @Override
    public K getData() {
        return data;
    }

    @Override
    public void setNext(INode newNode) {
        this.next = newNode;
    }

    @Override
    public INode getNext() {
        return next;
    }
}
