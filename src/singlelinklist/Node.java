/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package singlelinklist;

/**
 * @author Daniel García
 * 08/02/2024
 */
public class Node {
    private Object element;
    private Node next;

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String elemStr = element.toString();
        String nxtStr;
        if(next == null) nxtStr = "none";
        else nxtStr = next.toString();
        return "Element=" + elemStr + " (next: " + nxtStr + ")";
    }
    
    
}
