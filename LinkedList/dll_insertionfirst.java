package LinkedList;
import java.util.*;
public class dll_insertionfirst {
    public static class node{
        int val;
        node prev;
        node next;

        node(int val){
            this.val=val;
        }
    }
    public static node insertionbegin(node head , int val){
        node newnode = new node(val);
        newnode.next = head;
        if (newnode == null) {
            head.prev=newnode;
        }
        return newnode;
    }
    public static void display(node head){
        
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node head = null;
        System.out.println("Enter values to insert at beginning (-1 to stop):");
        while (true) {
           int x=sc.nextInt();
           if (x==-1) {
            break;
           }
           insertionbegin(head,x);
           display(head);
        }
    }
}
