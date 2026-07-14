
public class Binary_Tree_Height {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh)+1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;

    }


    
    
    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
        
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        
        
        return leftSum + rightSum + root.data;
    }
    

    //Approach 1
    public static int diameter(Node root){  //O(n^2)
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int lh =  height(root.left);

        int rightDiam = diameter(root.right);
        int rh = height(root.right);

        int selfDiam = lh + rh +1;

        return Math.max(Math.max(leftDiam, rightDiam), selfDiam);
    }


    
    public static void main(String[] args) {
        /*
                 1
               /  \
              2     3
             / \   / \
            4   5 6   7
        
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sumOfNode(root));

        System.out.println(diameter(root));
    } 
}