import java.util.Scanner;

public class costPerPerson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cost: ");
        double cost = scan.nextDouble();

        System.out.println("Cost is: " + cost);

        int ppl = 3;
        System.out.println("Per person: " + (cost / ppl));
    }
}

/*
1. switch to nextInt
2. Integer.parseInt
3. Double.parseDouble
4. Make '(cost / ppl)' a variable
 */