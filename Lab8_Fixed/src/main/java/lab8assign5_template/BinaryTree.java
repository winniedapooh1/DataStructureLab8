//BinaryTree.java
//* Coding Template for Lab8Assign5
//* To be modified by you
//* 
//* Implementation of Binary Tree data structure.

import java.util.Scanner;
package Lab8Assign5-Template.lab8assign5_template;
/**
 * Class for a binary tree that stores type E objects.
 *
 * @author Koffman and Wolfgang & Cindy & Your Name
 *
 */
public class BinaryTree<E> {

    public static void main(String[] args) {
        //create the expression tree in Fig 6.12 by directly creating the nodes
        //  and directly connecting them accordingly

        //create 2 leaf nodes
        Node<Character> x = new Node<>('x');
        Node<Character> y = new Node<>('y');
        //create the parent node of x and y:
        Node<Character> plus = new Node<>('+');
        //connect + and x, y:
        plus.left = x;
        plus.right = y;
        //by now the following tree is created:
        //     '+'
        //    /   \
        //  'x'   'y'

        //create a binary tree named exprBT that is rooted at +
        BinaryTree<Character> exprBT = new BinaryTree<>(plus);
        //or:
        //create an empty binary tree: exprBT
        BinaryTree<Character> exprBT2 = new BinaryTree<>();
        //make + as the root of the BT: exprBT       
        exprBT2.root = plus;
        //call toString() to verify the tree structure
        System.out.println(exprBT);
        System.out.println(exprBT2.toString());

        //----Lab8Assign5 Start------//
        //2.1
        //add more code to create the expression BT in Fig 6.12 on P.271
        //Hint: construct the tree by 
        //   starting with leaves and moving up to the root of the entire tree.     
        //   call toString() to verify the tree structure        
    }

    
    
    /**
     * get a string containing all data items in this binary tree. The string is
     * a preorder traversal sequence of this binary tree.
     *
     * @return the preorder traversal sequence of this binary tree as a string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //call the private recursive method to do the real job.
        preOrderTraverse(root, 1, sb);
        return sb.toString();
    }

    /**
     * Perform a preorder traversal of the binary tree rooted at node.
     *
     * @param node The local root (i.e. the current root node)
     * @param depth The depth of the local root
     * @param sb The string buffer to save the output
     */
    private void preOrderTraverse(Node<E> node, int depth,
            StringBuilder sb) {
        //add a number of spaces that is proportial to the depth value
        for (int i = 1; i < depth; i++) {
            sb.append("  ");
        }
        if (node == null) {         //current root node does not exist
            sb.append("null\n");
        } else {
            sb.append(node.toString()); //add current root node's data
            sb.append("\n");
            //recursively preorder traverse the left subtree of current root node
            preOrderTraverse(node.left, depth + 1, sb);
            //recursively preorder traverse the right subtree of current root node            
            preOrderTraverse(node.right, depth + 1, sb);
        }
    }    
    
    
    //HINT:
    //  Try to complete the methods in the listed order


    //Return the preorder traversal string of all items stored in this BinaryTree.
    //The return string MUST separate each two adjacent values by 2 spaces, not by newline character ‘\n’
    //	returns a string in this format: "house  dog  cat  kiss  man" for the tree in file WordBT_Data.txt.
    //public wrapper of preOrderTraverse.
    public String preOrderTraverse() {
        //add your code
        
        //Hint: this method is similar to (not the same) the following method, which is already implemented:
        // public String toString()
        
        return "";
    }

    //add your private recursive counterpart for public wrapper above: public String preOrderTraverse()
    private void preOrderTraverse(Node<E> currentRoot,
            StringBuilder currentResultSB) {

        //add your code
        
        //Hint: this method is very similar to the method below, which is already implemented
        //    private void preOrderTraverse(Node<E> node, int depth,StringBuilder sb)
        //	See pseudocode in file: BT-Traversal.pdf attached to Assign5 canvas page.
        
    }

    //Return the inorder traversal string of all items stored in this BinaryTree.
    //The return string MUST separate each two adjacent values by 2 spaces, not by newline character ‘\n’.  
    //	returns a string in this format: " cat  dog  house  kiss  man" for the tree in file WordBT_Data.txt.
    //public wrapper of inOrderTraverse.
    public String inOrderTraverse() {
        //add your code
        
        //Hint: this method is similar to (not same as) the following method:
        //    public String preOrderTraverse()
        
        return "";
    }

    //add your private recursive counterpart for the public wrapper above: public String inOrderTraverse()
    private void inOrderTraverse(Node<E> currentRoot,
            StringBuilder currentResultSB) {

        //add your code
        
        //Hint: this method is similar to (not the same) the method:
        //  private void preOrderTraverse(Node<E> currentRoot,StringBuilder currentResultSB)        
        //	Change the private recursive method for preordertraverse and make sure that in each level, 
        //          the current root is visited after the left subtree is visited and before the right subtree is visited.
        //	See pseudocode in file: BT-Traversal.pdf attached to Assign5 canvas page.       
    }
    
    //Return the postorder traversal string of all items stored in this BinaryTree.
    //The return string MUST separate each two adjacent values by 2 spaces, not by newline character ‘\n’.
    //	returns a string in this format: " cat  dog  man  kiss  house " for the tree in file WordBT_Data.txt.
    //public wrapper of postOrderTraverse.
    public String postOrderTraverse() {

        //add your code
        
        //Hint: this method is similar to (not same as) the method:
        //    public String preOrderTraverse()
        
        return "";
    }

    //add your private recursive counterpart for public wrapper above: public String postOrderTraverse()
    private void postOrderTraverse(Node<E> currentRoot,
            StringBuilder currentResultSB) {

        //add your code
        
        //Hint: this method is similar to (not the same) the method:
        //  private void preOrderTraverse(Node<E> currentRoot,StringBuilder currentResultSB)  
        //	Change the private recursive method for preorder traversal and make sure that in each level, 
        //         the current root is visited after both the left subtree and the right subtree are visited.
        //	See pseudocode in file: BT-Traversal.pdf attached to Assign5 canvas page.        
    }

    //traversal-based processing of BT
    //return the total number of data items in this BinaryTree
    //public wrapper of size().
    public int size() {
        //add your code
        
        //Hint: need to call its private recursive counterpart accordingly
        
        return 0;
    }

    //add your private recursive counterpart for the public wrapper: public int size()
    private int size(Node<E> currentRoot) {
        //add your code  
        
        //Hint
        //• In the private recursive version, you need to know the size of the two subtrees 
        //      before knowing the size of the entire tree.
        //• Use post order traversal
    
        return 0;
    }    
    
    //Return the height of this BinaryTree.
    //public wrapper of height.
    public int height() {
        //add your code
        
        //Hint: need to call its private recursive counterpart accordingly        
        
        return 0;
    }

    //add your private recursive counterpart for height
    private int height(Node<E> currentRoot) {
        //add your code        

        //Hint
        //• In the private recursive version, you need to know the heights of the two subtrees 
        //      before knowing the height of the entire tree.
        //• Use post order traversal     
        
        return 0;
    }    
    
    //--------Lab8Assign5 End ---------//
    
    
    /*<listing chapter="6" number="1">*/
    /**
     * Class to encapsulate a tree node.
     */
    protected static class Node<E> {
        // Data Fields

        /**
         * The information stored in this node.
         */
        protected E data;
        /**
         * Reference to the left child.
         */
        protected Node<E> left;
        /**
         * Reference to the right child.
         */
        protected Node<E> right;

        // Constructors
        /**
         * Construct a node with given data and no children.
         *
         * @param data The data to store in this node
         */
        //This constructor should be protected, not public,
        // because classes that are not subclasses of BinaryTree do not directly use Node.
        protected Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }

        // Methods
        /**
         * Returns a string representation of the node.
         *
         * @return A string representation of the data fields
         */
        //must be public because it overrides what's in class Object.
        @Override
        public String toString() {
            return data.toString();
        }
    }
    /*</listing>*/

    // Data Field
    /**
     * The root of the binary tree
     */
    //use the access modifier protected to give family member classes the direct access
    //   to the root data field.
    protected Node<E> root;

    /**
     * Construct an empty BinaryTree1
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Construct a BinaryTree1 with a specified root. Should only be used by
     * subclasses.
     *
     * @param root The node that is the root of the tree.
     */
    //Use the access modifier protected because we want to hide details of Node class
    //   from non-family member classes (i.e. classes that are not subclasses of BinaryTree).
    protected BinaryTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Constructs a new binary tree with data in its root,leftTree as its left
     * subtree and rightTree as its right subtree.
     */
    public BinaryTree(E data, BinaryTree<E> leftTree,
            BinaryTree<E> rightTree) {
        root = new Node<E>(data);           //new node: right, left are both null
        if (leftTree != null) {
            root.left = leftTree.root;
        } else {
            root.left = null;               //don't have to do this, root.left is already null
        }
        if (rightTree != null) {
            root.right = rightTree.root;
        } else {
            root.right = null;              //don't have to do this, root.right is already null.
        }
    }

    /**
     * Return the left subtree.
     *
     * @return The left subtree or null if either the root or the left subtree
     * is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if (root != null && root.left != null) { //if there is a left subtree
            return new BinaryTree<E>(root.left);
        } else {
            return null;
        }
    }

    /**
     * Return the right sub-tree
     *
     * @return the right sub-tree or null if either the root or the right
     * subtree is null.
     */
    public BinaryTree<E> getRightSubtree() {
        if (root != null && root.right != null) {   //if there is a right subtree
            return new BinaryTree<E>(root.right);
        } else {
            return null;
        }
    }

    /**
     * Return the data in the root node
     *
     * @return the data in the root node or null if the root is null
     */
    public E getData() {
        if (root != null) {
            return root.data;
        } else {
            return null;
        }
    }

    /**
     * Determine whether this tree is a leaf.
     *
     * @return true if the root has no children
     */
    public boolean isLeaf() {
        //empty tree or 1-node tree
        return (root == null || (root.left == null && root.right == null));
    }

//    /**
//     * get a string containing all data items in this binary tree. The string is
//     * a preorder traversal sequence of this binary tree.
//     *
//     * @return the preorder traversal sequence of this binary tree as a string.
//     */
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        //call the private recursive method to do the real job.
//        preOrderTraverse(root, 1, sb);
//        return sb.toString();
//    }
//
//    /**
//     * Perform a preorder traversal of the binary tree rooted at node.
//     *
//     * @param node The local root (i.e. the current root node)
//     * @param depth The depth of the local root
//     * @param sb The string buffer to save the output
//     */
//    private void preOrderTraverse(Node<E> node, int depth,
//            StringBuilder sb) {
//        //add a number of spaces that is proportial to the depth value
//        for (int i = 1; i < depth; i++) {
//            sb.append("  ");
//        }
//        if (node == null) {         //current root node does not exist
//            sb.append("null\n");
//        } else {
//            sb.append(node.toString()); //add current root node's data
//            sb.append("\n");
//            //recursively preorder traverse the left subtree of current root node
//            preOrderTraverse(node.left, depth + 1, sb);
//            //recursively preorder traverse the right subtree of current root node            
//            preOrderTraverse(node.right, depth + 1, sb);
//        }
//    }

    /*<listing chapter="6" number="2">*/
    /**
     * Method to read a binary tree.
     *
     * @pre The input consists of a preorder traversal of the binary tree. The
     * line "null" indicates a null tree.
     * @param scan the Scanner attached to the input file
     * @return The binary tree
     */
    public static BinaryTree<String> readBinaryTree(Scanner scan) {
        // Read a line and trim leading and trailing spaces.
        String data = scan.nextLine().trim();
        if (data.equals("null")) { //data (i.e. current root node's data) is "null"
            return null;
        } else {
            //recursively keep reading and building the left subtree of current root node until it's done.
            BinaryTree<String> leftTree = readBinaryTree(scan);
            //recursively keep reading and building the right subtree of current root node until it's done.
            BinaryTree<String> rightTree = readBinaryTree(scan);
            //build and return a new binary tree that has root data in variable data, leftTree as left subtree, rightTree as right subtree.
            return new BinaryTree<String>(data, leftTree, rightTree);
        }
    }
    /*</listing>*/
}
/*</listing>*/
