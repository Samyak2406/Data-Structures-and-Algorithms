import java.util.*;
class BinarySearchTree 
{
    static Scanner sc = new Scanner(System.in);
    static BST root = null;
    static int numberOfNodes = 0;
    static BST parent = null;
    //OKKKKKK
    static void insert(int n)
    {
        BST node = new BST(n);
        
        if(root == null)
        {
            root = node;
            return;
        }
        else{
        BST parent;
        BST child;
        parent = null;
        child = root;
        
        while(true)
        {
            parent = child;
            if(child.key > n)
            {
                child = child.left;
                if(child == null)
                {
                    parent.left = node;
                    return;
                }
            }
            //if(child.key <= n)
            else
            {
                child = child.right;
                if(child == null)
                {
                    parent.right = node;
                    return;
                }
            }
        }
        }
    }
    static int del,find;
    /*static void delete(BST node)
    {
        if(node.left!=null)
            delete(node.left);
        if(node.right!=null)
            delete(node.right);
        if(node.left.key == del)
        {
            //node.key = null;
            node.left = null;
            return;
        }
        if(node.right.key == del)
        {
            node.right = null;
            return;
        }
        if(t==10)
        {
            System.out.println("Element " + del + " is not found in the Binary Search Tree");
            t = 0;
        }
    }*/
    static int t = 0; 
    static void search(BST node)
    {
        if(node.key == find)
        {
            if(node.left != null)
                System.out.println("It has left child - " + node.left.key);
            else
                System.out.println("It has no left child.");
            if(node.right != null)
                System.out.println("It has right child - " + node.right.key);
            else 
                System.out.println("It has no right child.");
                
                t=10;
            return;
        }
        if(node.left!=null)
            search(node.left);
        if(node.right!=null)
            search(node.right);
        /*if(t==10)
        {
            System.out.println("Element " + find + " is not found in the Binary Search Tree");
            t = 0;
        }*/
    }
    //static int max;
    //OKKKKKK
    static void maximum(BST node)
    {
        while(node.right!=null)
        {
            node = node.right;
        }
        System.out.println(node.key + " is the maximum value in the Binary Search Tree.");

    }
    //OKKKKKK
    static void minimum(BST node)
    {
        while(node.left!=null)
        {
            node = node.left;
        }
        System.out.println(node.key + " is the minimum value in the Binary Search Tree.");
    }
    //OKKKKKK
    static void inOrderDisplay(BST node)
    {
        if(node.left!=null)
            inOrderDisplay(node.left);
        System.out.print(node.key + "  ");
        if(node.right!=null)
            inOrderDisplay(node.right);
    }
    //OKKKKKK
    static void preOrderDisplay(BST node)
    {
        System.out.print(node.key + "  ");
        if(node.left!=null)
            preOrderDisplay(node.left);
        if(node.right!=null)
            preOrderDisplay(node.right);
    }
    //OKKKKKK
    static void postOrderDisplay(BST node)
    {
        if(node.left!=null)
            postOrderDisplay(node.left);
        if(node.right!=null)
            postOrderDisplay(node.right);
        System.out.print(node.key + "  ");
    }
    public static void main(String[] args)
    {
        int n;
        do{
        System.out.println("______------ > BINARY SEARCH TREE < ------_______");
        System.out.println("            1.   INSERT");
        System.out.println("            2.   DISPLAY");
        System.out.println("            3.   SEARCH");
        System.out.println("            4.   MAXIMUM");
        System.out.println("            5.   MINIMUM");
        System.out.println("            6.   NUMBER OF NODES");
        System.out.println("            0.   EXIT");
        System.out.println("Enter your choice to be executed with the Binary Search Tree");
        n = sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.print("Enter the key to be added in the Binary Search Tree :     ");
                int key = sc.nextInt();
                insert(key);
                numberOfNodes++;
                break;
            case 2:
                if(numberOfNodes == 0)
                {
                    System.out.println("No nodes in the tree to be displayed.");
                    break;
                }
                System.out.println("Enter your choice :     ");
                System.out.println("1.   In-Order");
                System.out.println("2.   Pre-Order");
                System.out.println("3.   Post-Order");
                int c = sc.nextInt();
                switch(c)
                {
                    case 1:
                        System.out.println("In-Order Display is :");
                        inOrderDisplay(root);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Pre-Order Display is :");
                        preOrderDisplay(root);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Post-Order Display is :");
                        postOrderDisplay(root);
                        System.out.println();
                        break;
                    default:
                        System.out.println("Not a valid choice, not displaying any order.");
                        break;
                }
                break;
                /*
                if(numberOfNodes == 0)
                {
                    System.out.println("No more nodes to be deleted.");
                    break;
                }
                delete();
                numberOfNodes--;
                break;
                */
            case 3:
                if(numberOfNodes == 0)
                {
                    System.out.println("No nodes to be searched.");
                    break;
                }
                System.out.print("Enter the key value of the node to be searched :    ");
                find = sc.nextInt();
                search(root);
                break;
            case 4:
                if(numberOfNodes == 0)
                {
                    System.out.println("No nodes in the Binary Search Tree.");
                    break;
                }
                maximum(root);
                break;
            case 5:
                if(numberOfNodes == 0)
                {
                    System.out.println("No nodes in the Binary Search Tree.");
                    break;
                }
                minimum(root);
                break;
            case 6:
                System.out.println("The number of nodes in the Binary Search Tree is " + numberOfNodes + " .");
                break;
            case 0:
                System.out.println("Exiting the Binary Search Tree");
                break;
            default:
                System.out.println("Please enter a valid option in the range of 0-6");
        }
        }while(n != 0);
    }
}
class BST 
{
    int key;
    BST left;
    BST right;
    BST(int n)
    {
        this.key = n;
        this.left = null;
        this.right = null;
    }
}
