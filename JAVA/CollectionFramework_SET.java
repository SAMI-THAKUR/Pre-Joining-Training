import java.util.*;

// Set (does not allow duplicates)
public class CollectionFramework_SET {
    public static void main(String[] args) {
        // Primitive Data Type
        Set<String> set = new HashSet<>();
        set.add("Mumbai"); // adds an element to set
        set.add("Pune");
        set.add("Mumbai");
        set.add("Nashik");
        System.out.println(set);
        // most methods similar as LSIT

        // Non Primitive Datatype
        Set<Student> college = new HashSet<>();
        college .add(new Student(101, "Sami", 22));
        // Both objects will be stored because JAVA compares addr to make it work overwrite the compare in Student class
        college.add(new Student(101, "Sami", 22));
        college .add(new Student(103, "Amit", 23));
        System.out.println(college);

    }
}
