package StackPackage;

public interface INode<K> {

    public void setData(K data);

    public K getData();

    public void setNext(INode top);

    public INode getNext();
}
