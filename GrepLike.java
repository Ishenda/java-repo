import java.util.ArrayList;
import java.util.Scanner;

public class GrepLike {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> matchedLines = new ArrayList<>();

        // Step 1: Get the keyword
        System.out.println("Enter a query to search in a line:");
        String query = scn.nextLine();

        // Step 2: Accept lines until "END"
        System.out.println("Enter some text line (type 'END' to stop):");

        while (scn.hasNextLine()) {
            String line = scn.nextLine();

            if (line.equals("END")) {
                break;
            }

            // If the line contains the keyword, store it
            if (line.contains(query)) {
                matchedLines.add(line);
            }
        }

        // Step 3: Print results
        System.out.println("\nThank you... Bye!\n");

        if (matchedLines.isEmpty()) {
            System.out.println("No lines matched the keyword: " + query);
        } else {
            System.out.println("Here are the lines containing \"" + query + "\":");
            for (String matchedLine : matchedLines) {
                System.out.println(matchedLine);
            }
        }

        scn.close();
    }
}
