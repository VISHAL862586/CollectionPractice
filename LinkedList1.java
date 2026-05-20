public class LinkedList1 {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=next;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }

    //add at last 
    public void addLast(String data){
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

    //Print list

    public void printList(){
          if(head==null){
            System.out.println("List is Empty");
          }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    //Delete First
    public void deleteFirst(){
         if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        head = head.next;

    }

    //Delete LAst
    public void deleteLast(){
        if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }

    public static void main(String args[]){
        System.out.println("*-------Linked List -------*");

        LinkedList1 list = new LinkedList1();

        list.addFirst("Vishal");
        list.addFirst("Hi");
        list.printList();
        list.addLast("How");
        list.addLast("Are");
        list.addLast("You?");
        list.printList();
        list.deleteLast();
        list.printList();
    }
}
