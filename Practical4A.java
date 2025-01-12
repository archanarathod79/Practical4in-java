public class Practical4A {
    public static void main(String[] args) {
        int positiveNumber = 127;  // Positive number
        int negativeNumber = -128; // Negative number

        // Print the byte representation
        System.out.println("Byte representation of " + positiveNumber + ": " + getByte(positiveNumber));
        System.out.println("Byte representation of " + negativeNumber + ": " + getByte(negativeNumber));
    }

    // Method to convert int to byte
    public static byte getByte(int number) {
        return (byte) number; // Cast the integer to byte
    }
} 
