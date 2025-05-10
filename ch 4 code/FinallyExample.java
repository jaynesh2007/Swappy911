public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            int result = a / b; // No exception here
            System.out.println("Result: " + result);
        } 
        catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        } 
        finally {
            System.out.println("This is the finally block. It always runs.");
        }
    }
}