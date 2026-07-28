public class BST_Mirror {

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

    public static Node insert(Node root, int data){
         if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data); 
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    public static void main(String[] args){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }  

       
        inorder(root);
        System.out.println();

        mirror(root);
        inorder(root);
    }
}
