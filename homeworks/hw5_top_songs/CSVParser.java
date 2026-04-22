import java.util.ArrayList;

public class CSVParser {
    /**
     * Splits a CSV line into an array of fields, handling quoted fields that may contain commas.
     */
    public static ArrayList<String> splitCSVLine(String line) {
        ArrayList<String> result = new ArrayList<String>();
        String current = "";
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                result.add(current);
                current = "";
            } else {
                current += c;
            }
        }
        result.add(current);

        return result;
    }
}
