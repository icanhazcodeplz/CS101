// Idea based on YouTube "Animated ASCII Art Java Code #5": https://youtu.be/zEIsf-QhHxQ?si=Qxyi4QSaIkcfSh8D
public class hw1FlipBook {
    public static void main(String[] args) throws InterruptedException {

        // Loop forever (user will press Ctrl+C to stop)
        while (true) {

            int sleepMilliseconds = 500; // TODO: Adjust this to speed up or slow down the animation if you want

            // TODO: Create a 4 to 8 frame flip book. Shown below are is an example of a simple 2 frame book.
            //       Change the images in these two frames. You can add as many lines as you want per frame, but only
            //       make a maximum of 8 frames (I don't want you to spend all weekend on this).

            // FRAME 1
            System.out.println("\n".repeat(20)); // Creates 20 new lines to clear the console
            System.out.println("  O  ");
            System.out.println(" /|\\ ");
            System.out.println(" / \\ ");
            System.out.println("");
            Thread.sleep(sleepMilliseconds);

            // FRAME 2
            System.out.println("\n".repeat(20)); // Creates 20 new lines to clear the console
            System.out.println("  O  ");
            System.out.println(" \\|\\ ");
            System.out.println(" / \\ ");
            System.out.println("");
            Thread.sleep(sleepMilliseconds);

            // TODO: Make Frames 3,4, etc

        }
    }
}