package LinkedList;
import java.util.*;

public class dll_deleteHead {
    public static class node{
    int val;
    node next,prev;

    node (int val){
        this.val=val;
    }
  }
  public static node deletehead(node head){
    node temp = head;
    if (head == null) {
        return null;
    }
    head=head.next;
    if (head!=null) {
        head.prev=null;
    }
    return head;
  }
  public static void display(node head){
    node temp = head;
    while (temp!=null) {
        System.out.print(temp.val+" ");
        temp=temp.next;
    }
  }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node head = null;
        node tail = null;

        System.out.println("Enter initial values for the doubly linked list (-1 to stop):");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            node newNode = new node(n);
            if (head == null) {
                head =  newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        System.out.println("Before deletion:");
        display(head);
        System.out.println();

        head = deletehead(head);

        System.out.println("After deletion:");
        display(head);
    }

}
