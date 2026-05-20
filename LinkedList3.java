public class LinkedList3 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

   Node middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }




    public static void main(String args []){
        LinkedList3 list = new LinkedList3();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);

        System.out.println("List");
        list.printList();

       Node mid = list.middle(list.head);

        System.out.println("Middle Node: " + mid.data);
    }
    
}
