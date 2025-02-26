import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Deletion_Doubly_LL {
    static void printDLL(Node head) {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static Node deleteHead(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        
        Node newHead = head.next;
        newHead.prev = null;
        return newHead;
    }

    static Node deleteTail(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;
        
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        
        temp.next = null;
        return head;
    }

    static Node deleteKth(Node head, int k) {
        if(head == null) return null;
        Node temp = head;
        int count = 0;
        while(temp != null) {
            if(count == k) break;
            count++;
            temp = temp.next;
        }
        
        if(temp == null) return head;
        
        Node back = temp.prev;
        Node front = temp.next;

        if(back == null && front == null) {
            return null;
        } else if(back == null) {
            return deleteHead(head);
        } else if(front == null) {
            return deleteTail(head);
        } else {
            back.next = front;
            front.prev = back;
            return head;
        }
    }

    static Node arrayToDLL(int[] arr) {
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Node head = arrayToDLL(arr);
        head = deleteKth(head, k);
        printDLL(head);
    }
}
