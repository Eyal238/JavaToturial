public class IntList
{
    private IntNode head;
    public IntList()
    {
        head=null;
    }
    public IntList(IntNode node)
    {
        head=node;
    }
    public boolean empty()
    {
        if(head==null)
            return true;
        else
            return false;
    }
    // מחזיר את האיבר הבא ברשימה
    public IntNode nextElement(IntNode node)
    {
        return node.getNext();
    }
    public int getValueOfNode(IntNode node)
    {
        return node.getValue();
    }
    //מוסיפה איבר לסוף הרשימה
   public void addToEnd(IntNode node)
   {
       if(empty())
           head=node;
       else
       {
           IntNode ptr=head;
           while(ptr.getNext()!=null)
               ptr=ptr.getNext();
           ptr.setNext(node);
       }
   }
}

