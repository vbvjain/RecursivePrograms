package com.vbv;
public class Tree {
    private class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.buildTree();
        int size =  tree.getSize(root);
        System.out.println("Number of Nodes in tree are "+size);
        int height =  tree.getHeight(root);
        System.out.println("Height of the tree is  "+height);
    }

    private int getHeight(Node root) {
        if (root==null) return -1;
        int dL =  getHeight(root.left);
        int dR =  getHeight(root.right);
        if (dL>dR){
            int i = dL + 1;
            System.out.println("Returning from " + root + " with value " + i);
            return i;
        }
        else {
            int i = dR + 1;
            System.out.println("Returning from " + root + " with value " + i);
            return i;
        }

    }

    private int getSize(Node root) {
        if (root==null) return 0;
        int hL = getSize(root.left);
        int hR = getSize(root.right);
        return hL+hR+1;
    }

    private void printNodes(Node root) {
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }

    private Node buildTree() {
        Node A = new Node(314);
        Node B = new Node(6);
        Node C = new Node(271);
        Node D = new Node(28);
        Node E = new Node(0);
        Node F = new Node(561);
        Node G = new Node(3);
        Node H = new Node(17);
        Node I = new Node(6);
        Node J = new Node(2);
        Node K = new Node(1);
        Node L = new Node(401);
        Node M = new Node(641);
        Node N = new Node(257);
        Node O = new Node(271);
        Node P = new Node(28);
        A.left = B;
        A.right = I;
        B.left = C;
        B.right = F;
        C.left = D;
        C.right = E;
        F.right = G;
        G.left = H;
        I.left = J;
        I.right = O;
        J.right = K;
        O.right = P;
        K.left = L;
        K.right = N;
        L.right = M;
        return A;

    }
}
