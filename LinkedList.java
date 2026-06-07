



public class LinkedList {

    
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
    public static Node tail;
    public static int size;

    //Methods

    //addfirst
    public void addFirst(int data){           //O(1) constant

        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head; //Link


        //step = head = newNode
        head = newNode;
         
    }


    //addlast
    public void addLast(int data){           //O(1) constant

        //step1 = create new Node
        Node newNode = new Node(data);

        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = tail's next = newNode
        tail.next = newNode;

        //step3 =  make newNode to tail
        tail = newNode;
    }

    //print LL 
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


    //Add in the middle
    public void addInMiddle(int index, int data){
        
        if(index == 0){
            addFirst(data);
            return;
        }


        Node temp = head;
        int i=0;

        Node newNode = new Node(data);
        size++;
        while(i<index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    //Remove First
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail= null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove last
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
        }else if(size == 0){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }

        //prev : i = size-1;
        Node prev = head;
        for(int i =0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //Search in a LinkedList
    public int Search(int key){

        int i=0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return i;
            }else{
                temp = temp.next;
                i++;
            }
        }

        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);

        if(idx == -1){
            return -1;
        }else{
            return idx+1;
        }
    }


    //Reverse a LinkedList
    public void reverseLL(){    //O(n)
        Node prev = null;
        Node curr = tail  = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int recSearch(int key){
        return helper(head, key);
    }




    // question :  find and remove the nth node from end

    public void deleteNthfromend(int n ){
        Node temp = head;
        int i=1;

        if(n == size){
            head = head.next;    //remove first 
            return;
        }

        while(i < size-n){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;
        return;

    }


    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);  

        //Print the LinkedList
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        // ll.print();


         //Add in the Middle
        //  ll.addInMiddle(2, 6);
        //  ll.print();

        //  //size of LL
        //  System.out.println(ll.size);

        //  //remove from first
        //  System.out.println(ll.removeLast());
        //  ll.print();
        //  System.out.println(size);


        
        // System.out.println("Key is present at " + ll.recSearch(4)+ " position." );

        // ll.print();
        // ll.reverseLL();
        // ll.print();


        // find and remove the nth node from end
        ll.print();
        ll.deleteNthfromend(3);
        ll.print();

    }  
}  
