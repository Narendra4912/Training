package QueuePackage;

public interface INode<K> {

    public K getData();
    public void setNext(INode newNode);
    public INode getNext();
}
