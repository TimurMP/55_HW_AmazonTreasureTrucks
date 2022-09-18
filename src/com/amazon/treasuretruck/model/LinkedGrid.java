//package com.amazon.treasuretruck.model;
//
//import java.util.List;
//
//public class LinkedGrid<E> {
//
//    private Node<E> first;
//    private Node<E> last;
//    private int sizeVer;
//    private int sizeHor;
//
//
//    public boolean add(List<List<Integer>> grid){
//        for (int i = 0; i < grid.size(); i++) {
//             if (i == 0){
//                 for (int j = 0; j < grid.get(i).size(); j++) {
//                     Node<E> newNode = new Node<>()
//                     if (last != null) {
//                         last.next = newNode;
//                     } else {
//                         first = newNode;
//                     }
//
//
//                 }
//             }
//
//        }
//
//        return true;
//    }
//
//
//
//
//    private static class Node<E> {
//        Node<E> previous;
//        Node<E> next;
//        Node<E> up;
//        Node<E> down;
//
//        E data;
//
//        public Node(Node<E> previous, Node<E> next, Node<E> up, Node<E> down, E data) {
//            this.previous = previous;
//            this.next = next;
//            this.up = up;
//            this.down = down;
//            this.data = data;
//        }
//    }
//}
