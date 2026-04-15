public class practice4 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit #" + i + ": " + fruits[i]);
        }
    }
}
/*
Sample explanation:

Line 3: Declares a String array "fruits" with "apple", "banana", "cherry".
Line 5-7: For loop --> i goes from 0 to fruits.length - 1. Each iteration
          prints "Fruit", the current index, i, and the fruit at index i.

*/
