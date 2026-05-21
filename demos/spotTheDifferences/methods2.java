public class methods {

    public static void printDecimalOrNot(double num) {
        if (num % 1 == 0) {
            System.out.println(Num + " is a whole number");
        } else {
            System.out.println(Num + " is a decimal");
        }
    }

    public static void printEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }


    public static void main(String[] args) {
        double myNum = 3.14;
        printDecimalOrNot(mynum);
        printEvenOrOdd(myNum)
    }
}

