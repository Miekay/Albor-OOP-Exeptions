public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Attempt to access an element outside the bounds of the array
        int index = 6;
        int element = numbers[index];
        
        System.out.println("Element at index " + index + " is: " + element);
    }
}
