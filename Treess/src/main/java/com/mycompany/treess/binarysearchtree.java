/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treess;

/**
 *
 * @author Student
 */
class TreeNode {
    int key;
    TreeNode leftChild, rightChild;

    TreeNode(int value) {
        key = value;
        leftChild = rightChild = null;
    }
}

class binarysearchtree {
    TreeNode rootNode;

    TreeNode insertNode(TreeNode currentNode, int key) {
        if (currentNode == null) {
            return new TreeNode(key);
        }
        if (key < currentNode.key) {
            currentNode.leftChild = insertNode(currentNode.leftChild, key);
        } else if (key > currentNode.key) {
            currentNode.rightChild = insertNode(currentNode.rightChild, key);
        }
        return currentNode;
    }

    TreeNode deleteNode(TreeNode currentNode, int key) {
        if (currentNode == null) {
            return null;
        }

        if (key < currentNode.key) {
            currentNode.leftChild = deleteNode(currentNode.leftChild, key);
        } else if (key > currentNode.key) {
            currentNode.rightChild = deleteNode(currentNode.rightChild, key);
        } else {
            // Node to be deleted found

            // Case 1: No child
            if (currentNode.leftChild == null && currentNode.rightChild == null) {
                return null;
            }

            // Case 2: One child
            if (currentNode.leftChild == null) {
                return currentNode.rightChild;
            } else if (currentNode.rightChild == null) {
                return currentNode.leftChild;
            }

            // Case 3: Two children
            // Find inorder successor (smallest in the right subtree)
            TreeNode successor = findMin(currentNode.rightChild);
            currentNode.key = successor.key;

            // Delete the inorder successor
            currentNode.rightChild = deleteNode(currentNode.rightChild, successor.key);
        }
        return currentNode;
    }

    // Helper method to find the smallest node in a subtree
    TreeNode findMin(TreeNode node) {
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }
}

