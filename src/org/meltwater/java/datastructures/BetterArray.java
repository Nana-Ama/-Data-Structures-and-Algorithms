 package org.meltwater.java.datastructures;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class BetterArray {
    
    public static int[] reverseList(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
    
       public static int[] insertElem(int[] list, int position, int element) {
        int[] result = new int[list.length];

        for (int i = 0; i < position; i++) {
            result[i] = list[i];
        }
        result[position] = element;
        for (int i = position + 1; i < list.length; i++) {
            result[i] = list[i - 1];
        }
        return result;
    }
    
    public static int[] removeAtIndex(int[] list, int position) {
        int[] result = ArrayUtils.remove(list, position);
        return result;
    }
    
    public static int[] removeAllOccurances(int[] list, int element) {
//             int[] result = null;
//        while (ArrayUtils.contains(list, element)) {
//            result = ArrayUtils.removeElement(list, element);
//        }
//        return result;
        
        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != element) {
                list[j++] = list[i];
            }
        }
        int[] newArray = new int[j];
        System.arraycopy(list, 0, newArray, 0, j);
        return newArray;
    }
    
    public static int arraySize(int[] list) {
        int size =  list.length;
        return size;
    }
    
    public static int[] shiftElement(int[] list, int position, int element) {
        int[] result = new int[list.length];

        for (int i = 0; i < position; i++) {
            result[i] = list[i];
        }
        result[position] = element;
        for (int i = position + 1; i < list.length; i++) {
            result[i] = list[i - 1];
        }
        return result;
    }
    
    public static String convertToString(int[] list) {
       String arrayString = Arrays.toString(list);
        return arrayString;
    }
    
    public static int[] appendElement(int[] list, int position, int element) {
        int[] result = new int[list.length];

        for (int i = 0; i < position; i++) {
            result[i] = list[i];
        }
        result[position] = element;
        for (int i = position + 1; i < list.length; i++) {
            result[i] = list[i - 1];
        }
        return result;
    }
    
    public static int indexOfElement(int[] list, int element) {    
        Arrays.sort(list);
        int array = Arrays.binarySearch(list, element);
        
        if (array < 0) {
            return -1;
        }
        
        else {
        return array;
        }
   
    }
    
    public static boolean containsElement(int[] list, int element) {
        Arrays.sort(list);
        int array = Arrays.binarySearch(list, element);
        if (array < 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static int getElement(int[] list, int position) {
        
       int element = 0;
        try {
            element = list[position];
            return element;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry! the index is less than 0 or greater than maximum index occupied by an element in the array.");
            return -1;
        }
        
    }
    
    public static boolean checkEmpty(int[] list) {
        if (list.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] mainArray;
        mainArray = new int[11];
        mainArray[0] = 100;
        mainArray[1] = 200;
        mainArray[2] = 300;
        mainArray[3] = 400;
        mainArray[4] = 500;
        mainArray[5] = 600;
        mainArray[6] = 700;
        mainArray[7] = 800;
        mainArray[8] = 900;
        mainArray[9] = 1000;
        mainArray[10] = 200;
        
        BetterArray betterArray = new BetterArray();
        int[] insertResult = BetterArray.insertElem(mainArray, 5, 2000);
        System.out.println("Insert element 2000 at index 5: " + Arrays.toString(insertResult));
        
        int[] reverseResult = BetterArray.reverseList(mainArray);
        System.out.println("Reverse Array: " + Arrays.toString(reverseResult));
        
        int[] removeAtIndexResult = BetterArray.removeAtIndex(mainArray, 3);
        System.out.println("Remove element at index 3: " + Arrays.toString(removeAtIndexResult));
        
        int[] removeAllOccurancesResult = BetterArray.removeAllOccurances(mainArray, 200);
        System.out.println("Remove all occurances of element 3: " + Arrays.toString(removeAllOccurancesResult));
        
        int arraySize = BetterArray.arraySize(mainArray);
        System.out.println("The size of the array is: " + arraySize);
        
        String arrayString = BetterArray.convertToString(mainArray);
        System.out.println("The string representation of the array is: " + arrayString);
        
        int[] shiftResult = BetterArray.shiftElement(mainArray, 0, 50);
        System.out.println("Shift element at index 0 with element 50: " + Arrays.toString(shiftResult));
        
        int arrayEndIndex = arraySize - 1;
        int[] appendResult = BetterArray.appendElement(mainArray, arrayEndIndex, 1500);
        System.out.println("Append element 1500 to the end of the array: " + Arrays.toString(appendResult));
        
        int indexResult = BetterArray.indexOfElement(mainArray, 300);
        System.out.println("The index of element 300 in the array: " + indexResult);
        
        boolean containsResult = BetterArray.containsElement(mainArray, 300);
        System.out.println("Is the element 300 contained in the array?: " + containsResult);
        
        int getElementResult = BetterArray.getElement(mainArray, 20);
        System.out.println("The element at position 20 is: " + getElementResult);
        
        boolean checkEmptyResult = BetterArray.checkEmpty(mainArray);
        System.out.println("Is the array empty?: " + checkEmptyResult);
        
    }
    
}