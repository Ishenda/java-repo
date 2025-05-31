
public class FileNameParser {
    public static void main(String[] args) {
        // run: java FileNameParser.java report.pdf
        String s = args[0];
        int dot = s.indexOf(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());

        System.out.println("Base name: " + base);
        System.out.println("Extension: " + extension);
    }
}
