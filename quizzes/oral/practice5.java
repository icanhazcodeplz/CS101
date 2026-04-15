public class practice5 {
    public static void main(String[] args) {
        int area = rectangleArea(4, 6);
        System.out.println("Area: " + area);

        sayBye("Alex");
        sayBye("Morgan");
    }

    public static int rectangleArea(int width, int height) {
        return width * height;
    }

    public static void sayBye(String name) {
        System.out.println("Goodbye, " + name + "!");
    }
}
/*
Sample explanation:

Line 3: Calls rectangleArea with arguments 4 and 6, stores the return in "area".
Line 4: Prints "Area: " followed by area (24).
Line 6-7: Calls sayBye twice, with "Alex" and "Morgan".
Line 10-12: Defines rectangleArea — takes two ints as parameters, returns width * height.
Line 14-16: Defines sayBye — takes a String parameter called name, prints "Goodbye, name!". Returns nothing.

*/
