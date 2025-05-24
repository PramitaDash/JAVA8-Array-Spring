package collection;

//: Detect a loop in a custom singly linked list (Floyd’s Cycle detection).
public class LinkedListCycleDemo {
    static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static boolean hasCycle(Node head){
        Node slow = head, fast = head;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {

        // 🔹 List 1: 1 → 2 → 3 → 4 → 5 (no cycle)
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        System.out.println("List 1 has cycle? "+ hasCycle(head1));

        // 🔹 List 2: 10 → 20 → 30 → 40 → 50 → (back to 30)
        Node head2 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);

        head2.next = node20;
        node20.next = node30;
        node30.next = node40;
        node40.next = node50;
        node50.next = node30;

        System.out.println("List 2 has cycle? "+ hasCycle(head2));


    }
}
