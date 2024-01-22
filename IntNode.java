public class IntNode
{
    private int value;
    private IntNode next;
    public IntNode(int val)
    {
        this.value=val;
        this.next=null;
    }
    public IntNode(int val,IntNode next)
    {
        this.value=val;
        this.next=next;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int v)
    {
        value=v;
    }
    public IntNode getNext()
    {
        return next;
    }
    public void setNext(IntNode node)
    {
        next=node;
    }
    public String toString()
    {
        return (value+"-->"+next);
    }
}
