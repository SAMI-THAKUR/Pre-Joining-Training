public class StringArray {
    public static void main(String args []){
        // # STRING
        String name = "Sami Thakur"; // this way is prefered
        // String cannot be changed after creation
        String name2 = new String("Sami Thakur");
        // Commong Methods
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name == name2); // does not check content, checks addr of the var pointing
        System.out.println(name.equals(name2));

        // Substring (beginIndex, endIndex)
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));

        // # ARRAY
        int [] marks = new int[5]; // default values for int arrays are 0
        int [] marks2 = {90, 85, 95, 88, 92}; // intialize
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println((marks2.length));
        // array traversing
        for(int num : marks2){
            System.out.println(num);
        }

    }
}
