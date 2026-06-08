import java.util.*;
// HashMap (stores data in key-value pair)
// keys must be unique



public class CollectionFramework_MAP {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        // Integer - key and String - value
        // Primitive Data Type
        students.put(102, "SAMI"); // adds or updates a key-value pair
        students.put(103, "RAHUL");
        students.put(101, "AMIT");
        System.out.println(students);

        // Important Methods
        System.out.println(students.get(101)); // retrieve value by key
        System.out.println(students.getOrDefault(105, "DNE")); // returns default value if key doesn't exist
        System.out.println(students.containsKey(101));
        students.putIfAbsent(104, "New"); // adds only if key doesn't already exist
        System.out.println(students);

        // traversing map
        for(Integer key : students.keySet()) {
            System.out.println(key + " " + students.get(key));
        }

        // Non Primitive Datatype
        Map<Integer, Student> college = new HashMap<>();

        college.put(1,new Student(1,"Sami", 22));
        college.put(2,new Student(2,"Rahul", 23));

        System.out.println(college.get(1));
        System.out.println(college);
    }
}

