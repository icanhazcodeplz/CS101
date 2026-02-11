public class hw2Help {
    public static void main(String[] args) {
        double ru = 5.005;
        double rd = 5.004;
        System.out.println("ru: $" + ru);
        System.out.println("rd: $" + rd);

        String ruFormatted = String.format("%.2f", ru);
        String rdFormatted = String.format("%.2f", rd);

        System.out.println("ruFormatted: $" + ruFormatted);
        System.out.println("rdFormatted: $" + rdFormatted);
    }
}
