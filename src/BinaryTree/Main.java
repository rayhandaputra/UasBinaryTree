/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author User
 */
public class Main {
    /* Class untuk mengisi daun kanan dan kiri*/
    class Node { 
        int key; 
        Node left, right; 
   
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
   
    // Sebagai akar tree 
    Node root; 
   
    // Constructor 
    Main() {  
        root = null;  
    } 
   
    // Insert akar tree
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
       
    /*Fungsi Rekursif untuk memasukkan new key */
    Node insertRec(Node root, int key) { 
   
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
   
        /* Untuk menaruh leaf apakah di kiri atau kanan */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
   
        /* return the (unchanged) node pointer  */
        return root; 
    } 
   
    // Method inorder 
    void inorder()  { 
       inorderRec(root); 
    } 
   
    // Fungsi inorder traversal dari BinaryTree
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
   
    // Test Program nya
    public static void main(String[] args) { 
        Main tree = new Main(); 
   
        /* Contoh kita ingin membuah tree sebagai berikut 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
   
        // Print hasil akhir nya
        tree.inorder(); 
    }
}
