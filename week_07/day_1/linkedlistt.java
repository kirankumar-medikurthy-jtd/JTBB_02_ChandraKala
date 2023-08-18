public class linkedlistt {
    static Node first = null;

    static void insert(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;

        if (first == null) {
            first = temp;
            return;
        }

        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
    }

    static void deleteMiddle() {
        if (first == null || first.next == null) {
            return; // No middle node in an empty or single-node list
        }

        Node slow = first;
        Node fast = first;
        Node prevSlow = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }

        // Delete the middle node (slow)
        prevSlow.next = slow.next;
        slow.next = null;
    }

    static void display() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);

        System.out.println("Original list:");
        display();

        deleteMiddle();

        System.out.println("List after deleting the middle node:");
        display();
    }
}

class Node {
    int data;
    Node next;
}

