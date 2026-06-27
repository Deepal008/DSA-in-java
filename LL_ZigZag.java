
public class LL_ZigZag {

    public static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }


    public static Node head;


    

     public void addFirst(int data){          //O(1) constant

        //step1 = create new node
        Node newNode = new Node(data);
     

        if(head == null){
            head =  newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head; //Link


        //step = head = newNode
        head = newNode;
         
    }


    public void print(){       //O(n)
        if(head == null){
            System.out.println("LL is emplty");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        //alt merge -zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;


            left = nextL;
            right = nextR;
        }

    }
    public static void main(String[] args) {
        LL_ZigZag ll = new LL_ZigZag();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.zigzag();
        ll.print(); 

    }
}
