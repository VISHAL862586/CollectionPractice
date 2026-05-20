
public  class LinkedList2 {

    Node head;
    
    public class Node{
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
        Node currNode = head;

        if(currNode == null){
            System.out.println("List is Empty");
            return;
        }

        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void reverseList(){
        Node currNode = head;
        Node prevNode = null;
        
        while(currNode!=null){
            Node temp = currNode.next;
            currNode.next =prevNode;
            prevNode = currNode;
            currNode = temp;
        }

        head = prevNode;
    }

    public static void main(String args[]){
       LinkedList2 list = new LinkedList2();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);

        System.out.println("Orignal List");
        list.printList();

        System.out.println("Reversed List");
        list.reverseList();
        list.printList();


    }
    
}
