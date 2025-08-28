package LinkedList;
import java.util.*;
public class dll_reverse {
    public static class node{
        int val;
        node prev,next;
        node(int val){
            this.val=val;
        }
    }
    public static node insert(node head,int val){
        node newnode = new node(val);
        if (head == null) {
            return newnode;
        }
        node temp = head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
        return head;
    }
    public static node reverse(node head){
        node temp = null;
        node curr = head;
        while (curr!=null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp!=null) {
            head = temp.prev;
        }
        return head;
    }
    public static void display(node head){
        node temp = head;
        while (temp!=null) {
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node head = null;
        
        while (true) {
            int n = sc.nextInt();
            if (n==-1) {
                break;
            }
            head = insert(head, n);
        }
        head = reverse(head);

        display(head);
    }
}
