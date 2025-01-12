public class Practical4 {
    
    
    public static int getByte(int number) {
        return (byte) number; 
    }

    
    public static int getShort(int number) {
        return (short) number; 
    }

    
    public static String getNumber(int number, String type) {
        switch (type.toLowerCase()) {
            case "binary":
                return Integer.toBinaryString(number);  
            case "hexadecimal":
                return Integer.toHexString(number).toUpperCase();  
            case "decimal":
                return Integer.toString(number);  
            default:
                return "Invalid type";  
        }
    }
 public static String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    
    public static String decimalToHexadecimal(int num) {
        return Integer.toHexString(num).toUpperCase();
    }

    
    public static String decimalToOctal(int num) {
        return Integer.toOctalString(num);
    }

    
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    
    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static void main(String[] args) {
        int decimalNumber = 1234;  

        
        String binary = decimalToBinary(decimalNumber);
        String hexadecimal = decimalToHexadecimal(decimalNumber);
        String octal = decimalToOctal(decimalNumber);

        
        System.out.println("Decimal " + decimalNumber + " to Binary: " + binary);
        System.out.println("Decimal " + decimalNumber + " to Hexadecimal: " + hexadecimal);
        System.out.println("Decimal " + decimalNumber + " to Octal: " + octal);

        
        int decimalFromBinary = binaryToDecimal(binary);
        int decimalFromHex = hexadecimalToDecimal(hexadecimal);
        int decimalFromOctal = octalToDecimal(octal);

        
        System.out.println("Binary " + binary + " to Decimal: " + decimalFromBinary);
        System.out.println("Hexadecimal " + hexadecimal + " to Decimal: " + decimalFromHex);
        System.out.println("Octal " + octal + " to Decimal: " + decimalFromOctal);
    }
}

    
}

