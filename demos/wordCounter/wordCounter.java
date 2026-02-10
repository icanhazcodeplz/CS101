import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
// https://ocw.mit.edu/ans7870/6/6.006/s08/lecturenotes/files/t8.shakespeare.txt
public class wordCounter {
    public static void main(String[] args) throws Exception {
        String wordToFind = "witchcraft";
        String content = Files.readString(Path.of("/workspaces/67756774/shakespeare.txt"));
        long count = Pattern.compile(wordToFind).matcher(content).results().count();
        System.out.println("\nThe word '" + wordToFind + "' appears " + count + " times.");
    }
}
