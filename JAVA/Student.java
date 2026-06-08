import java.util.*;

// USED IN COLLECTION FRAMEWORK TASK

public class Student implements  Comparable<Student>{
    private String name;
    private int id;
    private int age;
    Student(int id, String name, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    // when we SOUT the object this will be printed
    public String toString(){
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    // overiding methods for the Set Collection to identify duplicated based on id
    @Override
    public boolean equals(Object obj){
        if(this == obj){ // check if both references point to the same object in memory
            return true;
        }
        // check is obj is null also if both obj are of same class
        if(obj==null || getClass()!=obj.getClass()){
            return false;
        }
        Student st = (Student) obj;
        return id==st.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Comparator function to sort by id compulsory func to implemet
    // because implemented the Comprable interface
    // Comparable is used when a class has a natural ordering
    // Used inside the class (Only one sorting logic)
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }
}
