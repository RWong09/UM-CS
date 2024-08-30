/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L12;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class BST<E extends Comparable<E>> {
    public TreeNode<E> root;
    public int size=0;
    
    public boolean search(E e){
        TreeNode<E> current=root;
        while(current!=null){
            if(current.element.compareTo(e)==0)
                return true;
            else{
                current=e.compareTo(current.element)<0 ? current.left : current.right;
            }
        }
        return false;
    }
    
    public boolean insert(E e){
        if(root==null)
            root=new TreeNode<>(e);
        else{
            TreeNode<E> parent=null;
            TreeNode<E> current=root;
            while(current!=null){
                if(e.compareTo(current.element)==0)
                    return false;
                parent=current;
                current=e.compareTo(current.element)<0 ? current.left : current.right;
            }
            if(e.compareTo(parent.element)<0)
                parent.left=new TreeNode<>(e);
            else
                parent.right=new TreeNode<>(e);
        }
        size++;
        return true;
    }
    
    public int getsize(){
        return size;
    }
    
    public int height(){
        return height(root);
    }
    
    private int height(TreeNode<E> node){
        if(node==null)
            return -1;
        return 1+Math.max(height(node.left), height(node.right));
    }
    
    public E getRoot(){
        return root.element;
    }
    
    public E minValue(){
        TreeNode<E> min=root;
        while(min.left!=null)
            min=min.left;
        return min.element;
    }
    
    public E maxValue(){
        TreeNode<E> max=root;
        while(max.right!=null)
            max=max.right;
        return max.element;
    }
    
    public ArrayList<TreeNode<E>> path(E e){
        if(root==null)
            return null;
        ArrayList<TreeNode<E>> path=new ArrayList<>();
        TreeNode<E> current=root;
        while(current!=null){
            path.add(current);
            if(current.element==e)
                break;
            current=e.compareTo(current.element)<0 ? current.left : current.right;
        }
        return path.get(path.size()-1).element==e ? path : null;
    }
    
    public boolean delete(E e){
        TreeNode<E> parent=null;
        TreeNode<E> current=root;
        while(current!=null){
            if(e.compareTo(current.element)==0)
                break;
            parent=current;
            current=e.compareTo(current.element)<0 ? current.left : current.right;
        }
        if(current==null)
            return false;
        
        if(current.left==null){
            if(parent==null)
                root=current.right;
            else if(e.compareTo(parent.element)<0)
                parent.left=current.right;
            else
                parent.right=current.right;
        }
        else{
            TreeNode<E> parentofRightMost=current;
            TreeNode<E> rightMost=current.left;
            while(rightMost.right!=null){
                parentofRightMost=rightMost;
                rightMost=rightMost.right;
            }
            current.element=rightMost.element;
            if(parentofRightMost.left==rightMost)
                parentofRightMost.left=rightMost.left;
            else
                parentofRightMost.right=rightMost.left;
        }
        size--;
        return true;
    }
    
    public boolean clear(){
        root=null;
        size=0;
        return true;
    }
    
    public void inorder(){
        inorder(root);
    }
    
    protected void inorder(TreeNode<E> root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right);
    }
    
    public void postorder(){
        postorder(root);
    }
    
    protected void postorder(TreeNode<E> root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }
    
    public void preorder(){
        preorder(root);
    }
    
    protected void preorder(TreeNode<E> root){
        if(root==null)
            return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
