
public class LL_palindrome {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static Node head;
    public static Node tail;
    public static int sz;

    public void adddata(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }


        newNode.next = head;
        head = newNode;
        sz++;
    }


    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"=>");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;   //slow is my midNode
    }

    public boolean palindrome(){
        //base case
        if(head == null || head.next == null){
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2- reverse 2n half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  // right half head
        Node left = head;
 
        //step3- check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main (String[] args){
        LL_palindrome LL = new LL_palindrome();
          
        LL.adddata(2);
        LL.adddata(2);
        LL.adddata(1);

        LL.print();
        System.out.println(LL.palindrome());
        LL.print();
    }
}
