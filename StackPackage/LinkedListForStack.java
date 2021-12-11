package StackPackage;

public class LinkedList<K> implements INode{

    K data;
    INode next;

    public LinkedList(K data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public void setData(Object data) {
        this.data = (K) data;
    }

    @Override
    public K getData() {
        return data;
    }

    @Override
    public void setNext(INode next) {
        this.next = next;
    }

    @Override
    public INode getNext() {
        return next;
    }




}
