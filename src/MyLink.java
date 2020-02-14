public class MyLink {
    Node head;
    public void deletefromposition(int pos)
    {
        int size =4;
        if(head==null)
        {
            System.out.println("list empty");
        }
        else if(pos<1 || pos>size)
        {
            System.out.println("invalid position");
        }
        else if(pos==size)
        {
            System.out.println("under construction");
            //deleteelement();
        }
        else {
        Node temp = head;
        Node previous = null;
        for (int i = 1; i <= pos - 1; i++) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = temp.next;
    }
    }


    public void deleteelement()
    {
        if(head == null)
        {
            System.out.println("no element found");
        }
        else
        {
            head = head.next;
        }
    }
    public void display()
    {
        if (head ==null)
        {
            System.out.println("no element found");
        }
        else
        {
            Node temp = head;
            while(temp!= null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    // insert at last
    public void  insert(Node n1){
        if (head==null)
        {
            head=n1;
        }
        else{
            Node temp = head;
            {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next=n1;
            }
        }
    }
}
