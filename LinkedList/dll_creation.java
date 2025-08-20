package LinkedList;

public class dll_creation {
    public static class node {
    int val;
    node prev;
    node next;
        node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        node a = new node(4);
        node b = new node(5);
        node c = new node(6);
        node d = new node(7);
        node e = new node(8);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        display(a);
    }
    public static void display(node head){
        node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}

