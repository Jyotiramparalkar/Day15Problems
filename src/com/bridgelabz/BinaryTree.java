package com.bridgelabz;

public class BinaryTree 
{
	  //Represent the root of binary tree
    public Node root;
    public BinaryTree()
    {
        root = null;
    }

    public Node insert(Node currentNode,int data){
        if ( currentNode == null){
            Node newNode = new Node(data);
            currentNode = newNode;
            return currentNode;
        }else if (data <= currentNode.data){
            currentNode.left = insert(currentNode.left, data);
           return currentNode;
        }else{
            currentNode.right = insert(currentNode.right, data);
            return currentNode;
        }
    }

    public void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        else {
            inOrderTraversal(root.left);
            System.out.print(root.data +" ");
            inOrderTraversal(root.right);
        }
    }
    public int size(Node root){
        if ( root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
    public static void main(String[] args) {
        System.out.println("Binary search tree problem");

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = binaryTree.insert( binaryTree.root,56);
        binaryTree.insert(binaryTree.root, 30);
        binaryTree.insert(binaryTree.root, 70);
        binaryTree.insert(binaryTree.root, 22);
        binaryTree.insert(binaryTree.root, 40);
        binaryTree.insert(binaryTree.root, 60);
        binaryTree.insert(binaryTree.root, 95);
        binaryTree.insert(binaryTree.root, 11);
        binaryTree.insert(binaryTree.root, 65);
        binaryTree.insert(binaryTree.root, 3);
        binaryTree.insert(binaryTree.root, 16);
        binaryTree.insert(binaryTree.root, 63);
        binaryTree.insert(binaryTree.root, 67);

        binaryTree.inOrderTraversal(binaryTree.root);

        System.out.println("\nSize : "+ binaryTree.size(binaryTree.root));
    }
}
