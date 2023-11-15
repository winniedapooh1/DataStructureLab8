/** ReadBinaryTreeTest.java
 * Lab8Assign5 Template
 * To be modified by you
 *
 * Read a text file that contains the preorder traversal sequence of the data items in a binary tree
 *    The preorder traversal sequence also shows the structure of the tree.
 * Construct the binary tree accordingly.
 * Display the preorder traversal sequence of the data items in the constructed binary tree,
 *     which is the same as what is in the text file when the tree is constructed correctly.
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Your name
 */
public class ReadBinaryTreeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree<String> binaryTree1 = new BinaryTree<>();

        try {

            //---Lab8Assign5 Start -------//
            //0. Check if you placed file WordBT_Data.txt in your project folder
            //    where the folder src is.
            
            
            //1. Create a Scanner for reading from the data file WordBT_Data.txt
            
            //2. call the static method readBinaryTree(....) to 
            //   create the binary tree of Strings using data read from file: WordBT_Data.txt
            
            //3. call each method you implemented and verify the result.
            // * You don’t need to call the main() method in BinaryTree class.
            // * For verification, I suggest that you print the return value of the called method.

            
            //---Lab8Assign5 End -------//
                       
            
            //the code below was given in the lectures and will be helpful for you.
            
            
            //create a Scanner object that is associated with the file Fig_6_12.txt.
            Scanner input = new Scanner(new File("Fig_6_12.txt"));
            //call the static method readBinaryTree1 to read data in Fig_6_12.txt
            //   and construct the corresponding binary tree
            //   and assign the reference to this tree to binaryTree1.
            binaryTree1 = BinaryTree.readBinaryTree(input);
            //close the scanner object.
            input.close();
            //print the string, which is the preorder traversal sequence of data stored in binaryTree1.
            System.out.println(binaryTree1.toString());
        } catch (FileNotFoundException e) { //handle the case when Fig_6_12.txt is not found.
            e.printStackTrace();    //Print the error stack: this exception, and its backtrace for the cause of this exception.
            System.exit(1);         //terminate this program with the status code 1, indicating abnormal termination.
        }
    }

}


/*----Your output for the BT read from WordBT_Data.txt:
house
  dog
    cat
      null
      null
    null
  kiss
    null
    man
      null
      null

Preorder traversal:   house  dog  cat  kiss  man
Inorder traversal:   cat  dog  house  kiss  man
postorder traversal:   cat  dog  man  kiss  house
size: 5
height: 3

*/