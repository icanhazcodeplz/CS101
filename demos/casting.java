
public class casting {
    public static void main(String[] args) {

        // ===========================================
        // WIDENING (Automatic) - "Casting Up"
        // Smaller type -> Larger type (no data loss)
        // ===========================================

        int myInt = 42;
        double myDouble = myInt;  // int automatically converts to double
        System.out.println(myInt);

        // ===========================================
        // NARROWING (Manual) - "Casting Down"
        // Larger type -> Smaller type (possible data loss!)
        // ===========================================

        double price = 19.99;
        int priceInt = (int) price;  // Must explicitly cast - loses decimal!
        System.out.println(price);

        // Another narrowing example
        int numInt = 127;
        byte numByte = (byte) numInt;  // byte only holds -128 to 127!
        System.out.println(numInt);
        System.out.println(numByte);

        // ===========================================
        // STRING CONCATENATION - Implicit casting to String
        // ===========================================

        System.out.println("hi" + 5);      // "hi" + 5 -> "hi" + "5" -> "hi5"
        System.out.println(5 + 5 + "hi");  // 10 + "hi" -> "10hi" (left to right!)
        System.out.println("hi" + 5 + 5);  // "hi5" + 5 -> "hi55" (left to right!)

    }
}

