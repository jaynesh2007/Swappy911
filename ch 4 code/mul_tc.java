public class mul_tc {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // This will throw ArrayIndexOutOfBoundsException

            int result = 10 / 0;         // This would throw ArithmeticException (but not reached)
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        }
    }
}