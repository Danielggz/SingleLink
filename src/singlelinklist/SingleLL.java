/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package singlelinklist;

/**
 * @author Daniel García
 * 08/02/2024
 */
public class SingleLL implements SingleLLInterface{
    private Node head, curr, prev;
    private int size;

    public SingleLL() {
        this.size = 0;
        head = null;
        curr = null;
        prev = null;
    }
    
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        //size == 0 will be true or false
        return size == 0;
    }

    @Override
    public void display() {
        Node n = head;
        while(n != null){
            System.out.println(n.toString());
            n = n.getNext();
        }
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element, null);
        if(head == null){
            head = newNode;
        }else{
            setCurrent(size);
            curr.setNext(newNode);
        }
        size++;
    }
    

    @Override
    public void add(int index, Object element) {
        //add at the head of list
        if(index == 1){
            Node newNode = new Node(element, head);
            head = newNode;
        }else{
            setCurrent(index);
            Node newNode = new Node(element, curr);
            prev.setNext(newNode);
        }
        size++;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    @Override
    public void remove(int index) {
        if(isEmpty()){
            System.out.println("nothing to remove");
        }else{
            if(index == 1){
               head = head.getNext();
            }else{
                setCurrent(index);
                prev.setNext(curr.getNext());
            }
            size--;
        }
    }
    
    private void setCurrent(int index){
        prev = null;
        curr = head;
        for(int k = 1; k < index; k++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    private void reverse(){
        
    }
}
