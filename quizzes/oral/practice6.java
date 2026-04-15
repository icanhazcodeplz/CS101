public class practice6 {
    public static void main(String[] args) {
        int[] temps = {72, 68, 75, 70};
        int total = 0;

        for (int t : temps) {
            total += t;
        }

        int average = total / temps.length;
        System.out.println("Average temp: " + average);

        if (average > 70) {
            System.out.println("It was a warm week.");
        } else {
            System.out.println("It was a cool week.");
        }
    }
}
/*
Sample explanation:

Line 3: Declares an int array "temps" with 4 values.
Line 4: Declares int "total" set to 0.
Line 6-8: For-each loop --> adds each element of temps to total.
Line 10: Divides total by the number of elements to get the average (integer division).
Line 11: Prints "Average temp: " followed by average.
Line 13-17: If average > 70, print "It was a warm week.", otherwise print "It was a cool week.".

*/
