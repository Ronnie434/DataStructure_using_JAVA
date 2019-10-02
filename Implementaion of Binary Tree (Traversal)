

//////// IMPLEMENTATION OF BINARY TREE //////////
/////// TRAVERSAL OF TREE IN DIFFRENT TYPES OF ORDERS///////
////// PREORDER TRAVERSAL////// POSTORDER TRAVERSAL////// INORDER TRAVERSAL/////


public class BinaryTree{
    
    private static class Node{
        private int key;
        Node left,right;
        Node(int data){
            key = data;
            left = right = null;
        }
    }
    
    private Node root;
    
    //// PRINTING PREORDER TRAVERSEL /////
    public void printPreorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.key);// value of root
        printPreorder(node.left);// value of left tree
        printPreorder(node.right);// value of right tree
    }
    
    ///// PRINTING POSTORDER TRAVERSAL /////
    public void printPostorder(Node node){
        if(node == null){
            return;
        }     
        printPostorder(node.left);// value of left tree
        printPostorder(node.right);// value of right tree
        System.out.print(node.key);// value of root
    }
    
    ///// PRINTING INORDER TRAVERSAL /////
    public void printinorder(Node node){
        if(node == null){
            return;
        }
        printinorder(node.left);// value of left tree
        System.out.print(node.key);// value of root
        printinorder(node.right);// value of right tree
        
    }
    ///// Wrappers over above recursive functions  ////
    public void printPreorder(){
        printPreorder(root);
    }
    public void printPostorder(){
        printPostorder(root);
    }
    public void printinorder(){
        printinorder(root);
    }
    
    public static void main(String []args){
        
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        System.out.print("PreOrder :\t");
        tree.printPreorder();
        System.out.println();
        System.out.print("PostOrder : \t");
        tree.printPostorder();
        System.out.println();
        System.out.print("Inorder :\t");
        tree.printinorder();
        
    }
}
