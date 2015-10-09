
package org.meltwater.java.datastructures;

import java.util.LinkedList;


public class Singly {
    
    public static void addElem(LinkedList<String> list, int index, Object item) {
        list.add(index, (String) item);
    }

    public static boolean removeElement(LinkedList<String> list, Object item) {
        return list.remove(item);
    }
    
    
    public static int listSize( LinkedList<String> list) {
        int size = list.size();
        return size;
    }
    

    public static boolean checkEmpty(LinkedList<String> list) {
       return list.isEmpty();
    }
    
    
 

    public static String listTail(LinkedList<String> list) {
        return list.getLast();
    }
    
    public static String listHead(LinkedList<String> list) {
        return list.getFirst();
    }
    
    public static boolean containsElement(LinkedList<String> list, Object item) {
        boolean res = list.contains(item);
        return res;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
          LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");
        
        Singly singly = new Singly();
        
        int listSize = singly.listSize(linkedlist);
        System.out.println("The size of the list is: " + listSize);
        
        boolean listContains = Singly.containsElement(linkedlist, "Item1");
        System.out.println("Does the list contain 'Item1' ?: " + listContains);
        
        String listHead = Singly.listHead(linkedlist);
        System.out.println("The head of the list is: " + listHead);
        
        String listTail = Singly.listTail(linkedlist);
        System.out.println("The tail of the list is: " + listTail);
        
        boolean removeElem = Singly.removeElement(linkedlist, "Item6");
        System.out.println("Has the item 'Item6' been removed? " + removeElem);
        System.out.println(linkedlist);
        
        Singly.addElem(linkedlist, 2, "Item8");
        System.out.println("New item 'Item8' has been added at position 2." + linkedlist);
        
        boolean isEmpty = Singly.checkEmpty(linkedlist);
        System.out.println("Is the list empty? " + isEmpty);
      
      
    }
    

    
}
