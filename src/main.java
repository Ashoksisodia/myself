class Test{
    public static void main(String[] args)
    {
        Node n1=new Node(10);
        MyLink obj=new MyLink();
        obj.insert(n1);
        Node n2=new Node(20);
        Node n3=new Node(30);
        obj.insert(n2);
        obj.insert(n3);
        Node n4=new Node(40);
        obj.insert(n4);
        obj.display();
        obj.deletefromposition(3);
        obj.display();
    }

}
