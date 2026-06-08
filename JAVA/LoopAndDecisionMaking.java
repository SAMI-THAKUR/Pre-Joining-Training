public class LoopAndDecisionMaking {
    public static void main(String [] args){
        // IF ELSE-IF ELSE
        int age = 22;
        if(age > 18){
            System.out.println("Can Drive");
        }else{
            System.out.println("Cannot Drive");
        }

        int marks = 75;

        if(marks >= 90) {
            System.out.println("A");
        }else if(marks >= 75) {
            System.out.println("B");
        }else if(marks >= 60) {
            System.out.println("C");
        }else {
            System.out.println("Fail");
        }

        // switch statement (checking a variable against many fixed values)
        String day = "MONDAY";
        switch (day) {
            case "MONDAY":
                System.out.println("Start of work week");
                break;
            case "SATURDAY":
            case "SUNDAY":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Regular day");
        }

        // Loops (repeat code multiple times)
        // FOR LOOP (when number of iterations are know)
        // for(initialization; condition; incr or decr)
        for(int i = 1; i <= 10; i++) {
            if(i%2!=0){
                continue; // skip the current iteration
            }
            if(i==9){
                break; // stop the loop
            }
            System.out.println(i);
        }
        // WHILE LOOP (when number of iterations are unknow)
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }
        i = 1;
        // DO WHILE LOOP (it runs atleast once)
        do {
            System.out.println(i);
            i++;
        } while(i <= 5);
    }
}
