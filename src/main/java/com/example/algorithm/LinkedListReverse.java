package com.example.algorithm;

public class LinkedListReverse {

    public static void main(String[] args){
        Node head=new Node(0);
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        printNode(head);
        Node newNode= Node.reverse(head);
        printNode(newNode);

    }

    public static class Node{
        public int value;
        public Node next;
        public Node(int value) {
            this.value=value;
        }

        public static Node reverse(Node head) {
            if(head==null || head.next==null) {
                return head;
            }
            Node temp = head.next;
            Node newNode = reverse(head.next);
            temp.next= head;
            head.next=null;
            return newNode;
        }
    }

    public static void printNode(Node node){
        System.out.println("--------------------");
        Node head = node;
        while(null != head){
            System.out.print(head.value);
            head=head.next;
        }
        System.out.println();
    }
}
