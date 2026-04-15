public class practice1 {
    public static void main(String[] args) {
        int count = 10;

        while (count > 0) {
            System.out.println(count);
            count -= 2;
        }

        System.out.println("Blast off!");
    }
}
/*
Sample explanation:

Line 3: Declares int "count" set to 10.
Line 5: While loop --> While count is greater than 0, print `count` and then decrement count by 2 each iteration
Line 10: After the loop ends, prints "Blast off!".
*/