// List (used to store an ordered collection of elements)
// allows duplicate elements
// index based access
// allows null
// --- ArrayList
// --- LinkedList
// --- Stack

import java.util.*;

public class CollectionFramework_LIST {
    public static void main(String[] args) {
        // primitive data types
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10); // add element at the end
        al.add(12);
        al.add(1, 25); // add element at a specific position
        al.add(1);

        // important methods of lists
        System.out.println(al.get(0)); // retrieving elem using index
        al.set(0,100); // update the element at the index
        System.out.println(al.get(0));
        al.remove(0); // remove an elements using index
        System.out.println(al.get(0));
        System.out.println(al.size());
        System.out.println(al.contains(12)); // check whethe the elements in there or not
        System.out.println(al.isEmpty());
        System.out.println(al.toString());
        // al.clear(); // empty the list
        System.out.println(al.toString());
        // Sorting Primitive List
        Collections.sort(al);
        System.out.println(al);

        // non primitive data type
        ArrayList<Student> college = new ArrayList<>();
        college .add(new Student(105, "Sami", 22));
        college.add(new Student(101, "Rahul", 21));
        college .add(new Student(104, "Amit", 23));
        System.out.println(college);
        Collections.sort(college);
        System.out.println(college);

        // Comparator (custom sorting logic) (Multiple sorting logics)
        Comparator<Student> sortByName = (s1, s2) -> s1.getName().compareTo(s2.getName());
        college.sort(sortByName);
        System.out.println(college);

        // other way to sort lambda expression
        college.sort((a, b) -> a.getName().compareTo(b.getName()));

    }
}
