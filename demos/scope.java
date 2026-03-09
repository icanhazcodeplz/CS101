public class scope {
    public static void main(String[] args) {
        // =============================================================
        //  SCOPE: the region of code where a variable exists and can
        //         be accessed. A variable declared inside a block { }
        //         is only accessible within that block.
        // =============================================================

        int x = 1;
        int y = 2;
        if (x == 1) {
            System.out.println("Inside");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        System.out.println("Outside");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /* TODO
        - move y inside (error)
        - reassign y inside (value remains outside)
        - for loop (show debugger)
        - define iterator outside for-loop
        - Add inner loop
         */
    }
}