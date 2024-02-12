/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinklist;

/**
 *
 * @author Daniel García
 */
public class SingleLinkListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleLL sl = new SingleLL();
        sl.add("elem1");
        sl.add(2, "elem2");
        sl.add(3, "elem3");
        
        System.out.println("Size: " +sl.size());
        sl.display();
        sl.add(2, "elem4");
         System.out.println("Size: " +sl.size());
        sl.display();
        sl.remove(1);
        System.out.println("index 1 removed");
        sl.display();
        sl.remove(1);
        System.out.println("index 1 removed");
        sl.display();
        sl.remove(1);
        sl.remove(1);
        sl.remove(1);
    }
    
}
