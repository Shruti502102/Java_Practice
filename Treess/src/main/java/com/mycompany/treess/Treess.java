/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.treess;

/**
 *
 * @author Student
 */
class TreeNode{//binary tree node 
    int key;
    TreeNode left,right;
    TreeNode(int value){
        key=value;
        left=right=null;
    }
}
//binary tree height
class Treess{
    TreeNode root;
    int findHeight(TreeNode node){
        if(node==null) return 0;
        int leftHeight=findHeight(node.left);
        int rightHeight=findHeight(node.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    public static void main(String[] args) {
        Treess t=new Treess();
        t.root=new TreeNode(1);
        t.root.left=new TreeNode(2);
        t.root.right=new TreeNode(3);
        t.root.left.left=new TreeNode(5);
        t.root.left.right=new TreeNode(7);
        int height=t.findHeight(t.root); 
        System.out.println("Height of the Tree: "+height);
    }
}
