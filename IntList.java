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
    // האם הרשימה ריקה?
    public boolean empty()
    {
        if(head==null)
            return true;
        else
            return false;
    }
    //מחזירה את אורך הרשימה
    public int length()
    {
        IntNode ptr=head;
        int count=0;
        while(ptr!=null)
        {
            count++;
            ptr=ptr.getNext();
        }
        return count;
    }
    // מחזירה את האיבר הבא ברשימה
    public IntNode nextElement(IntNode node)
    {
        return node.getNext();
    }
    // מחזיר את הערך של האיבר הנוכחי
    public int getValueOfNode(IntNode node)
    {
        return node.getValue();
    }
    //מחזירה את האיבר הקודם
    public IntNode predecessor(IntNode node)
    {
        if(head==null||head==node)  // אם הרשימה ריקה או הוא שווה לראש הרשימה ואין איבר לפניו
            return null;
        IntNode ptr=head;
        while(ptr.getNext()!=null)    //אם האיבר הבא הוא אז נחזיר את הנוכחי
        {
            if(ptr.getNext()==node)
                return ptr;
            else ptr=ptr.getNext();
        }
        return null;
    }
    // מדפיסה את הרשימה
    public void printList()
    {
        IntNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.getValue()+"-->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }
    //מוסיפה איבר לסוף הרשימה
   public void addToEnd(IntNode node)
   {
       if(empty()==true)
           head=node;
       else
       {
           IntNode ptr=head;
           while(ptr.getNext()!=null)
               ptr=ptr.getNext();
           ptr.setNext(node);
       }
   }
   // הוספת איבר לתחילת הרשימה
   public void addToHead(IntNode node)
   {
       IntNode temp=head;
       head=node;
       node.setNext(temp);
   }
   // הוצאת איבר מרשימה
   public void remove(int num)
   {
       if(head!=null)
       {
           if(head.getValue()==num)
               head=head.getNext();
           else
           {
               IntNode ptr = head;
               while (ptr.getNext() != null)
               {
                   if(ptr.getNext().getValue()==num)
                        ptr.setNext(ptr.getNext().getNext());
                   else
                        ptr=ptr.getNext();
               }
           }
       }
   }
}

   
