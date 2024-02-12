/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package singlelinklist;

/**
 *
 * @author Daniel García
 * 08/02/2024
 */
public interface SingleLLInterface {
    public int size();
    public boolean isEmpty();
    public void display();
    public void add(Object element);
    public void add(int index, Object element);
    public Object get(int index);
    public void remove(int index);
}
