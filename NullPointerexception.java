public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String text = null;

        // Attempt to call a method on a null object reference
        int length = text.length();

        System.out.println("Length of the string is: " + length);
    }
}
