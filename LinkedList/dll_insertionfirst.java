package LinkedList;
import java.util.*;

public class dll_insertionfirst {
    public static class node {
        int val;
        node prev;
        node next;

        node(int val) {
            this.val = val;
        }
    }
    public static node insertionbegin(node head, int val) {
        node newnode = new node(val);
        newnode.next = head;
        newnode.prev = null;

        if (head != null) {
            head.prev = newnode;
        }
        return newnode; 
    }

    public static void display(node head) {
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

        System.out.println("Enter initial values for the doubly linked list (-1 to stop):");
        while (true) {
            int x = sc.nextInt();
            if (x == -1) break;
            head = insertionbegin(head, x); 
        }

        System.out.print("Initial list: ");
        display(head);

        System.out.print("Enter value to insert before head: ");
        int newVal = sc.nextInt();
        head = insertionbegin(head, newVal); 

        System.out.print("Updated list: ");
        display(head);
    }
}