// Error - usually caused by the JVM or the runtime environment (not expected to handle)
// Exception - unexpected thing occured in prog (recoverable conditions)
// Trying to divide something by zero gives ArithmeticException
// Why Exception Handling: without exception handling end never execute prog gets terminated at line of exception
// Exception Hierarchy
// Throwable
// -@ Error
// --- StackOverflowError
// -@ Exception
// --# Runtime (occurs during program execution) (also called unchecked because compiler dont check)
// --- ArithmeticException
// --- ArrayIndexOutOfBoundsException
// --- StringIndexOutOfBoundsException
// --# Checked Exceptions (these are checked by the compiler)
// --- ClassNotFoundException
// --- SQLException
// --- FileNotFoundException

public class ExceptionHandling {
    // throw and throws
    // throws: used in method declaration indicates the method may throw exception
    // throw: used in body and explicitly throw and exception
    public static boolean validateAge (int age) throws IllegalArgumentException{
        if(age<=18){
            throw new IllegalArgumentException("User must be at least 18 years old");
        }
        System.out.println("good to go");
        return true;
    }
    public static void main(String[] args) {
        // try catch
        try{
            // risky code
            int [] arr = {1,2,3,4,0};
            for(int i=0; i<6 ; i++){
                System.out.println(arr[i]);
            }
            int a = 10/arr[4];
        }catch(ArithmeticException e){
            // handling code
            System.out.println("division by 0");
        } catch (RuntimeException e) { // can add a generalize cathc statement or a can add for specific exception
            System.out.println(e.getMessage()); // returns the exception message
            System.out.println(e.toString()); // returns exception class name + message
            System.out.println(e.getStackTrace()); //
            System.out.println(e.getCause()); // returns the cause of the exception
        }finally {
            // runs whether exception occurs or not
            System.out.println("Always Executes");
        }


        int age = 16;
        try{
            validateAge(20);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
