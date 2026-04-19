/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList 
and a LinkedList to perform the following operations with different functions directed as follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,
5. Updating elements, 6. Removing elements, 7. Searching elements, 8.List size, 9. Iterating over list, 
10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/

package linkedlist;
import java.util.*;

public class listoperations {

	
	    // 1. Adding elements
	    public static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        System.out.println("After adding elements: " + list);
	    }

	    // 2. Add element at specific index
	    public static void addAtIndex(List<String> list) {
	        list.add(1, "Mango");
	        System.out.println("After adding at index: " + list);
	    }

	    // 3. Add multiple elements
	    public static void addMultiple(List<String> list) {
	        List<String> newList = Arrays.asList("Grapes", "Pineapple");
	        list.addAll(newList);
	        System.out.println("After adding multiple: " + list);
	    }

	    // 4. Access element
	    public static void accessElement(List<String> list) {
	        System.out.println("Element at index 2: " + list.get(2));
	    }

	    // 5. Update element
	    public static void updateElement(List<String> list) {
	        list.set(1, "Kiwi");
	        System.out.println("After update: " + list);
	    }

	    // 6. Remove element
	    public static void removeElement(List<String> list) {
	        list.remove("Apple");
	        System.out.println("After removal: " + list);
	    }

	    // 7. Search element
	    public static void searchElement(List<String> list) {
	        System.out.println("Contains Banana? " + list.contains("Banana"));
	    }

	    // 8. List size
	    public static void listSize(List<String> list) {
	        System.out.println("List size: " + list.size());
	    }

	    // 9. Iteration
	    public static void iterateList(List<String> list) {
	        System.out.println("Using for-each:");
	        for (String item : list) {
	            System.out.println(item);
	        }
	    }

	    // 10. Iterator
	    public static void useIterator(List<String> list) {
	        System.out.println("Using Iterator:");
	        Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }

	    // 11. Sorting
	    public static void sortList(List<String> list) {
	        Collections.sort(list);
	        System.out.println("Sorted list: " + list);
	    }

	    // 12. Sublist
	    public static void subList(List<String> list) {
	        System.out.println("Sublist (1 to 3): " + list.subList(1, 3));
	    }

	    // 13. Clear list
	    public static void clearList(List<String> list) {
	        list.clear();
	        System.out.println("After clearing: " + list);
	    }

	    public static void main(String[] args) {

	        System.out.println("=== ArrayList ===");
	        List<String> arrayList = new ArrayList<>();

	        addElements(arrayList);
	        addAtIndex(arrayList);
	        addMultiple(arrayList);
	        accessElement(arrayList);
	        updateElement(arrayList);
	        removeElement(arrayList);
	        searchElement(arrayList);
	        listSize(arrayList);
	        iterateList(arrayList);
	        useIterator(arrayList);
	        sortList(arrayList);
	        subList(arrayList);
	        clearList(arrayList);

	        System.out.println("\n=== LinkedList ===");
	        List<String> linkedList = new LinkedList<>();

	        addElements(linkedList);
	        addAtIndex(linkedList);
	        addMultiple(linkedList);
	        accessElement(linkedList);
	        updateElement(linkedList);
	        removeElement(linkedList);
	        searchElement(linkedList);
	        listSize(linkedList);
	        iterateList(linkedList);
	        useIterator(linkedList);
	        sortList(linkedList);
	        subList(linkedList);
	        clearList(linkedList);
	    }
	}


