/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12;

/**
 *
 * @author HP
 */
public class TestBST {
    public static void main(String[] args) {
        BST<Integer> test=new BST<>();
        
        int[] input={45,88,54,76,98,1,2,20,6,53,42,100,86,32,28,65,14};
        System.out.print("Input data: ");
        for(int i:input){
            test.insert(i);
            if(i==input[input.length-1])
                System.out.print(i);
            else
                System.out.print(i+", ");
        }
        System.out.println();
        
        System.out.print("Inorder (sorted): ");
        test.inorder();
        System.out.println();
        
        System.out.print("Postorder: ");
        test.postorder();
        System.out.println();
        
        System.out.print("Preorder: ");
        test.preorder();
        System.out.println();
        
        System.out.println("Height for BST: "+test.height());
        
        System.out.println("Root for BST is: "+test.getRoot());
        
        System.out.println("Check whether 10 is in the tree? "+test.search(10));
        
        test.delete(53);
        System.out.println("Delete 53");
        
        System.out.print("Update Inorder data (sorted): ");
        test.inorder();
        System.out.println();
        
        System.out.println("Min value: "+test.minValue());
        System.out.println("Max value: "+test.maxValue());
        
        System.out.print("A path from the root 6 is: ");
        for(TreeNode<Integer> get:test.path(6))
            System.out.print(get.element+" ");
        System.out.println();
    }
}
